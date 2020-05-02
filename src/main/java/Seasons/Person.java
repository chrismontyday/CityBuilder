package Seasons;

public class Person {
	
	boolean isFemale;
	short birthday;
	short age;
	short production = 5;
	
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public short getProduction() {
		return production;
	}
	public void setProduction(short production) {
		this.production = production;
	}
	

}
