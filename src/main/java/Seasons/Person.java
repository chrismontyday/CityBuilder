package Seasons;

public class Person {
	
	boolean isFemale;
	// birthdays are 2 
	short birthday;
	short age;
	short foodConsumption;

	
	public short getFoodConsumption() {
		
		if(this.age>=55) {
			this.foodConsumption = 4;
		} else if(this.isFemale==true&&this.age>20&&this.age<55) {
			this.foodConsumption = 4;
		} else if(this.isFemale==false&&this.age>20&&this.age<55) {
			this.foodConsumption = 6;
		} else if (this.age<=20&&this.age>10) {
			this.foodConsumption = 3;
		} else if (this.age<=10&&this.age>4) {
			this.foodConsumption = 2;
		} else if (this.age<=3) {
			this.foodConsumption = 1;
		}
		
		return foodConsumption;
	}

	public Person(boolean isFemale, short birthday, short age) {
		super();
		this.isFemale = isFemale;
		this.birthday = birthday;
		this.age = age;
	}
	
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
	
	public short getBirthday() {
		return birthday;
	}	
	public void setBirthday(short birthday) {
		this.birthday = birthday;
	}
	

}
