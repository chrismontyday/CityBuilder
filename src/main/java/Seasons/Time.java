package Seasons;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import Structures.Building;
import Structures.Farm;


public class Time {
	
	static int lengthOfMonth = 1;
	static int startingPopNumber = 30;
	static String cityName;
	static long food = 2000;
	
	Months month = new Months();
	Timer timer;
	
	static List<Person> population = new ArrayList<Person>();
	static List<Farm> farms = new ArrayList<Farm>();
	static Council council = new Council();
	
	 public Time(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
		}

	    class RemindTask extends TimerTask {
	    	
	    	
	    	//runs entire game
	        public void run() {
	        	
	        	month.updateTime();
	        	
	        	Population age = new Population();
	        	age.ageOnBirthday(population, (short)month.getNumberOfMonths());
	        	
	        	
	        	Production production = new Production();
	        	long monthlyProduction = production.addUpProduction(population);
	        	age.newBaby(population, food, monthlyProduction);
	        	int popSize = population.size();
	        	
	        	
	        	
	        	Food adjustFood = new Food();
	        	food += adjustFood.addToFood(farms, month.getNumberOfMonths());
	        	food -= adjustFood.eatFood(population);
	        	
	        	
	        	council.generalUpdate(cityName, monthlyProduction, popSize, food);
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
	    	
	    	Time newTimer = new Time(lengthOfMonth);
	    	
	    }
	    
	 
	    
}
