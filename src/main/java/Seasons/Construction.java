package Seasons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Structures.Building;
import Structures.Farm;
import Structures.SmallFarm;

public class Construction {

	//creates starting buildings
	public List<Farm> startingBuildings() {
				
		List<Farm> firstBuildings = new ArrayList<Farm>();
		
		for (int i = 0; i<4; i++) {
			
			Farm farm = new Farm(400, 15, 400);
			
			firstBuildings.add(farm);
		}
		
		
		return firstBuildings;
		
	}
	
}
