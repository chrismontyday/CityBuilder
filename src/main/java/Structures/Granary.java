package Structures;

public class Granary extends Building implements Structures{
	
	public Granary() {
	this.type = "granary";
	this.maintenence = 50;
	
	}

	public int returnMaintenence() {
		return this.maintenence;
	}

	public int getCost() {
		return this.cost;
	}
}
