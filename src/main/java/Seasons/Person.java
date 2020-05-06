package Seasons;

public class Person {
	
	boolean isFemale;
	// birthdays are 2 
	short birthday;
	short age;

	
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
