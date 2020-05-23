package Seasons;

import java.util.List;
import java.util.Scanner;

public class Council {
	
	Months month;
	Construction build;
	
	public String startGame() {
		
		System.out.println("What is the name of your fair city?");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String cityName = input.nextLine();
		
		return cityName;
		
	}
	
	public void listenToCommand() {
		
		
		Scanner input = new Scanner(System.in);
		String command = input.nextLine();
		
	
	
		
	}
	
	//prints out monthly update
	public void generalUpdate(String cityName, Long production, Integer pop, long food) {
		System.out.println("You have " + production + " leftover production from " + pop + " population and "
				+ food + " food in your granaries "
				+ "in " + month.printDate() + " in the humble city of " + cityName);
	}
	
	//prints out population data once a year
	public void census(List<Person> pop) {
		int youngling = 0;
		int men = 0;
		int women = 0;
		int baby = 0;
		int elderly = 0;
		
		for(int i = 0; i <pop.size(); i++) {
			
			short age = pop.get(i).getAge();
			
			if(age<=3) {
				baby++;
			} else if (age<15&&age>3) {
				youngling++;
			} else if (age>=15&&age<=45) {
				if(pop.get(i).isFemale==true) {
					women++;
				}
				if(pop.get(i).isFemale==false) {
					men++;
				}
			} else if (age>45) {
				elderly++;
			}
		}
		
		System.out.println("We have " + men + " men, " + women + " women, " + youngling + " younglings, " + baby + " new borns and " + elderly + " elderly." );
	}


}
