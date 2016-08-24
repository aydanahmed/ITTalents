package student;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (!subject.isEmpty()) {
			this.subject = subject;
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade >= 2 && grade <= 6) {
			this.grade = grade;
		}
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		if (yearInCollege > 1 && yearInCollege <= 4) {
			this.yearInCollege = yearInCollege;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}

	public boolean isDegree() {
		return isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money > 0) {
			this.money = money;
		}
	}

	void upYear() {
		if (yearInCollege < 4) {
			yearInCollege++;
			if (yearInCollege == 4) {
				isDegree = true;
			}
		} else {
			System.out.println("Incorrect data entered.");
		}
	}

	double receiveSchoolarship(double min, double amount) {
		if (this.grade >= 4 && this.age < 30) {
			this.money += amount;
		}
		return money;
	}

}
