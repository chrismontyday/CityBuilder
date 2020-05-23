package Seasons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Resources.Food;
import Structures.Building;
import Structures.Farm;

public class Construction {

	//creates starting buildings
	public List<Farm> startingBuildings() {
				
		List<Farm> firstBuildings = new ArrayList<Farm>();
		
		for (int i = 0; i<4; i++) {
			
			Farm farm = new Farm();
			
			firstBuildings.add(farm);
		}
		
		
		return firstBuildings;
		
	}
	
}
