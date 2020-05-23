package Structures;

abstract public class Building {

	protected int cost;
	protected int maintenence;
	protected String type;
	
	
	public Building() {
		super();
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int productionToBuildCost) {
		this.cost = productionToBuildCost;
	}

	public int getMaintenence() {
		return maintenence;
	}

	public void setMaintenence(int monthlyMaintenenceCost) {
		this.maintenence = monthlyMaintenenceCost;
	}

}