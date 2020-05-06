package Seasons;

import java.util.List;

public class Food {

	
	long food;
	
	public long addToFood(long production, int month) {
		if(month >= 4 && month <=10) {
			return food += production*2;
		} else
			return 0;	
		
	}
	
	public long eatFood(List<Person> pop) {
		long foodConsumption = 0;
		
		for(int i = 0; i<pop.size(); i++) {
			if(pop.get(i).getAge()>=20) {
				foodConsumption += 2;
			} else
				foodConsumption++;
			
		}
		
		return foodConsumption;
	}
}
