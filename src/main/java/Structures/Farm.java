package Structures;

import Resources.Food;

public class Farm extends Building implements Structures {
	
	private long bounty;
	private short foodType;
	
	public Farm() {
		this.type = "farm";
		this.cost = 150;
		this.maintenence = 15;
		this.bounty = 400;
		
	}
	public short getFoodType() {
		return foodType;
	}
	public void setFoodType(short foodType) {
		this.foodType = foodType;
	}

	public long getBounty() {
		return bounty;
	}

	public void setBounty(long bounty) {
		this.bounty = bounty;
	}

	public int returnMaintenence() {

		return this.maintenence;
	}
	
	
	
}
