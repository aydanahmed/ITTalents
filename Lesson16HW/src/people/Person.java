package people;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age > this.getAge()) {
			this.age = age;
		}
	}
	
	public boolean isMale() {
		return isMale;
	}

	void showPersonInfo() {
		System.out.println("Name of person is: " + this.getName());
		System.out.println("Age of " + this.getName() + " is " + this.getAge() + " years old.");
		System.out.println(isMale ? this.getName() + " is " + "Male" : this.getName() + " is " + "Female");
	}

}
