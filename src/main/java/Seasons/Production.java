package Seasons;

import java.util.List;

public class Production {
	

	public long addUpProduction(List<Person> pop) {

		long totalProduction = 0;
		
		for(int i = 0; i < pop.size(); i++) {
			
			long production;
			short age = pop.get(i).getAge();
			boolean isFemale = pop.get(i).isFemale();
			
			
			if(isFemale == true && age >=15) {
				production = 3;
			} else if (isFemale == false && age >=15) {
				production = 5;
			} else if (age < 15 && age >=10){
				production = 1;
			} else if (age < 10 && age >= 4) {
				production = 0;
			} else if (age == 3) {
				production = -1;
			} else if (age == 2) {
				production = -2;
			} else if (age <= 1) {
				production = -3; 
			} else {
				production = 1;
			}
			
			totalProduction += production;
		}
		
		return totalProduction;
	}
	
	
	
	 

}
