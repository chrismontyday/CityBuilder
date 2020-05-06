package Seasons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Population {
	
	
	//creates starting population
	public List<Person> startingPopulation(int startingPopulationNumber) {
				
		List<Person> pop = new ArrayList<Person>();
		Random rand = new Random();
		
		for (int i = 0; i<startingPopulationNumber; i++) {
			
			boolean isFemale = rand.nextBoolean();
			short age = (short) rand.nextInt(50);
			short birthday = (short) (rand.nextInt(11) + 1);
			Person person = new Person(isFemale, birthday, age);
			
			pop.add(person);
		}
		
		return pop;
		
	}
	
	//updates age of individual person based on their birth month
	public void ageOnBirthday(List<Person> pop, short birthday){
		
		Random rand = new Random();
		
		for(int i = 0; i < pop.size(); i++) {
			if(pop.get(i).getBirthday()==birthday) {
				pop.get(i).setAge((short) (pop.get(i).getAge() + 1));
			} 
			
			int age = pop.get(i).getAge();
			
			//determines baby death for each month
			if(age<=1&&rand.nextInt(100)==42) {
				pop.remove(i);
			}
			int death = rand.nextInt(10000000);
			
			if(age>1&&death-(age*age)<=9) {
				pop.remove(i);
			}
			
		}
	}
	
	//creates a new baby
	public Person newBaby() {
		
		Person person;
		Random rand = new Random();
		Months month = new Months();
	
		boolean isFemale = rand.nextBoolean();
		short age = 0;
		short birthday = (short) month.getNumberOfMonths();
		return person = new Person(isFemale, birthday, age);
	}
	
	//adds a new baby to the population
	public void newBaby(List<Person> pop, long food, long production) {
		
		int women = 0;
		int child = 0;
		
		for(int i = 0; i<pop.size(); i++) {
			if(pop.get(i).getAge()>=17 && pop.get(i).getAge()<=45) {
				women++;
			}
			if(pop.get(i).getAge()<= 4) {
				child++;
			}
		}
		
		if(women-child>0) {
		
		if(food - ((long) pop.size()*12) > 0 && production > 0) {
			Person person = newBaby();
			pop.add(person);
		}
		}
	}
	

}
