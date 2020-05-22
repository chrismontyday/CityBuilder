package Structures;

public class SmallFarm extends Building  {

	private int bounty = 400;
	private short foodType;
	
	public SmallFarm(int cost, int maintain, int bounty) {
		this.cost = cost;
		this.maintenence = maintain;
		this.bounty = bounty;
	}
	public short getFoodType() {
		return foodType;
	}
	public void setFoodType(short foodType) {
		this.foodType = foodType;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}
	
	
	
	
}
