package Seasons;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import Resources.Food;
import Structures.Building;
import Structures.Farm;
import Structures.Structures;


public class Time {
	
	static int lengthOfMonth = 1;
	static int startingPopNumber = 30;
	static String cityName;
	static Food food = new Food();
	
	Months month = new Months();
	Timer timer;
	
	static List<Person> population = new ArrayList<Person>();
	static List<Farm> farms = new ArrayList<Farm>();
	static List<Structures> buildings = new ArrayList<Structures>();
	static Council council = new Council();
	
	 public Time(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
		}

	    class RemindTask extends TimerTask {
	    	
	    	
	    	//runs entire game
	        public void run() {
	        	
	        	month.updateTime();
	        	
	        	//Population
	        	Population age = new Population();
	        	age.ageOnBirthday(population, (short)month.getNumberOfMonths());
	        	food.setValueTrue(age.populationFoodConsumption(population, food));
	        	
	        	//Production
	        	Production production = new Production();
	        	long monthlyProduction = production.addUpProduction(population);
	        	age.newBaby(population, food, monthlyProduction);
	        	int popSize = population.size();
	        	
	        	
	        	//Buildings
	        	Buildings adjustFood = new Buildings();
	        	//Charges Maintenence for Buildings from Production
	        	monthlyProduction -= adjustFood.maintenenceCosts(farms);
	        	//Tallys up food bounty for each month
	        	food.setValue(adjustFood.addToFood(farms, month.getNumberOfMonths()) + monthlyProduction);
	        	
	        	//Council
	        	council.generalUpdate(cityName, monthlyProduction, popSize, food.getValue());
	        	if(month.getNumberOfMonths()==1) {
	        		council.census(population);       	
	        	}
	        	
	        	monthlyProduction = 0;
	        	timer.cancel();
	        	new Time(lengthOfMonth);	
	        }
	    }
	    
	    public static void main(String[] args) {

	    	cityName = council.startGame();
	    	
	    	Population newPop = new Population();
	    	population = newPop.startingPopulation(startingPopNumber);
	    	
	    	Construction newCity = new Construction();
	    	farms = newCity.startingBuildings();
	    	
	    	food.setValue(6000);
	    	
	    	Time newTimer = new Time(lengthOfMonth);
	    	
	    }
	    
	 
	    
}
