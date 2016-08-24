package people;

public class Employee extends Person {
	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}

	double calculateOverTime(double hours) {
		if (this.getAge() <= 18) {
			return 0;
		}

		if (this.getAge() > 18) {
			double moneyPerHour = this.getDaySalary() / 8;
			return hours * (moneyPerHour*1.5);
		}
		return -1;

	}

	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println(this.getName() + " for 1 day work get a: " + this.getDaySalary() + " lv.");

	}

}
