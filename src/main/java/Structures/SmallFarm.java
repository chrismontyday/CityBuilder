package Structures;

public class SmallFarm extends Building {


	private int productionToBuildCost = 400;
	private int monthlyMaintenenceCost = 15;
	private short foodType = 1;
	private short harvestMonths[] =  { 9, 10 };
	private boolean isBuilt = false;
	
	public int getProductionToBuildCost() {
		return productionToBuildCost;
	}
	public void setProductionToBuildCost(int productionToBuildCost) {
		this.productionToBuildCost = productionToBuildCost;
	}
	public int getMonthlyMaintenenceCost() {
		return monthlyMaintenenceCost;
	}
	public void setMonthlyMaintenenceCost(int monthlyMaintenenceCost) {
		this.monthlyMaintenenceCost = monthlyMaintenenceCost;
	}
	public short getFoodType() {
		return foodType;
	}
	public void setFoodType(short foodType) {
		this.foodType = foodType;
	}
	public short[] getHarvestMonths() {
		return harvestMonths;
	}
	public void setHarvestMonths(short[] harvestMonths) {
		this.harvestMonths = harvestMonths;
	}
	public boolean isBuilt() {
		return isBuilt;
	}
	public void setBuilt(boolean isBuilt) {
		this.isBuilt = isBuilt;
	}
	
	
	
	
}
