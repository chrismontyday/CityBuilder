package Seasons;

import java.util.List;

import Resources.Food;
import Structures.Farm;

public class Buildings {
	
	
	
 public long addToFood(List<Farm> farms, int month) {
		
		long food = 0;
		
		for(Farm farm : farms) {
		
			food += farm.getBounty();
			
		}
		return food;
		
	}
 
 public long maintenenceCosts(List<Farm> farms) {
	 
	 long costs = 0;
	 
	 for (Farm farm : farms) {
		 costs += farm.getMaintenence();
	 }
	 
	 return costs;
 }
	
	
}
