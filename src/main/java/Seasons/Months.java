package Seasons;

import java.util.Timer;
import java.util.TimerTask;

public class Months {
	
	private static int lengthOfMonth = 1;
    private static int numberOfMonths = 0;
    private static int numberOfYears = 1;
	Timer timer;

    public Months(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
        	
        	if(numberOfMonths<12) {
        		numberOfMonths++;
        	} else {
        		numberOfMonths = 1;
        		numberOfYears++;
        	}
        	printDate();
        	timer.cancel();
        	new Months(lengthOfMonth);
        }
    }

    public static void main(String args[]) {
        new Months(lengthOfMonth);   
    }
    
    public static void printDate() {
    	
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
    	} else if(numberOfYears == 7) {
    		year = numberOfYears + "th";
    	} 
    	
    	System.out.println(month + " of the " + year + " year");
    }
}