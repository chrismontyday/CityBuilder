package Seasons;

import java.util.Scanner;

public class Production {
	
	
	Person person = new Person();
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of your humble city?");
		String cityName = input.nextLine();
		
		startGame(cityName);
		
		
        }
	
	public static void startGame(String cityName) {
		long turnTally = 1;
		Months month = new Months(1);
		//List(person) population = new ArrayList()<>;
			
		while (true) {
			
			int monthNumber = month.getNumberOfMonths();
			int yearNumber = month.getNumberOfYears();
			
			if(turnTally == month.getTotalNumberOfMonths()) {				
				System.out.println("It is " + printDate(monthNumber,yearNumber) + " in the fair city of " + cityName);
			turnTally++;
			}
			
			
		}
		
		
	}
	
	
	
	  public static String printDate(int numMonth, int numYear) {
		  
	    	int numberOfMonths = numMonth;
	    	int numberOfYears = numYear;
	    	String month = "";
	    	String year = "";
	    	
	    	if(numberOfMonths == 1) {
	    		month = "January";
	    	} else if(numberOfMonths == 2) {
	    		month = "February";
	    	} else if(numberOfMonths == 3) {
	    		month = "March";
	    	} else if(numberOfMonths == 4) {
	    		month = "April";
	    	} else if(numberOfMonths == 5) {
	    		month = "May";
	    	} else if(numberOfMonths == 6) {
	    		month = "June";
	    	} else if(numberOfMonths == 7) {
	    		month = "July";
	    	} else if(numberOfMonths == 8) {
	    		month = "August";
	    	} else if(numberOfMonths == 9) {
	    		month = "September";
	    	} else if(numberOfMonths == 10) {
	    		month = "October";
	    	} else if(numberOfMonths == 11) {
	    		month = "November";
	    	} else if(numberOfMonths == 12) {
	    		month = "December";
	    	} 
	    	
	    	if(numberOfYears == 1) {
	    		year = "1st";
	    	} else if(numberOfYears == 2) {
	    		year = "2nd";
	    	} else if(numberOfYears == 3) {
	    		year = "3rd";
	    	} else if(numberOfYears == 4) {
	    		year = "4th";
	    	} else if(numberOfYears == 5) {
	    		year = "5th";
	    	} else if(numberOfYears == 6) {
	    		year = "6th";
	    	} else{
	    		year = numberOfYears + "th";
	    	}  
	    		
	    	
	    	 return month + " of the " + year + " year";
	    }

}
