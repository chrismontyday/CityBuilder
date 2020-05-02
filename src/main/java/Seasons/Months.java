package Seasons;

import java.util.Timer;
import java.util.TimerTask;

public class Months {
	
	private static int lengthOfMonth = 1;
	private long totalNumberOfMonths = 1;
	private int numberOfMonths = 1;
	private int numberOfYears = 1;
   

	Timer timer;

    public Months(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
        	
        	if(numberOfMonths<12) {
        		totalNumberOfMonths++;
        		numberOfMonths++;
        	} else {
        		numberOfMonths = 1;
        		numberOfYears++;
        	}
        	timer.cancel();
        	new Months(lengthOfMonth);
        }
    }

    public static void main(String args[]) {
        new Months(lengthOfMonth);   
    }
    
    public int getNumberOfMonths() {
    	return numberOfMonths;
    }
    
    public int getNumberOfYears() {
    	return numberOfYears;
    }

	public static void setLengthOfMonth(int lengthOfMonth) {
		Months.lengthOfMonth = lengthOfMonth;
	}
  
	public long getTotalNumberOfMonths() {
		return totalNumberOfMonths;
	}
}