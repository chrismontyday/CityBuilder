package Seasons;

import java.util.List;

import Structures.Building;
import Structures.Farm;
import Structures.SmallFarm;

public class Food {

	
	long food;
	
 long addToFood(List<Farm> farms, int month) {
		
		//long food = 0;
		
		for(int i = 0; i<farms.size(); i++) {
		
				food += farms.get(i).getBounty();
			
		}
		return food;
		
	}
	
	public long eatFood(List<Person> pop) {
		long foodConsumption = 0;
		
		for(int i = 0; i<pop.size(); i++) {
			if(pop.get(i).getAge()>=20) {
				foodConsumption += 10;
			} else
				foodConsumption++;
			
		}
		
		return foodConsumption;
	}
}
