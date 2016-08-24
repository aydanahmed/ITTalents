package people;

public class Student extends Person {
	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
	}

	void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Grade of " + this.getName() + " is " + this.getScore());
	}

}
