package people;

public class Main {

	public static void main(String[] args) {
		Person[] manyPeople = new Person[10];
		Person person1 = new Person("Krasi", 20, true);
		Person person2 = new Person("Krasimira", 20, false);

		Student ivancho = new Student("Ivan", 22, true, 4.25);
		Student petko = new Student("Petko", 21, true, 3.00);

		Employee emp1 = new Employee("Dragan", 22, true, 30);
		Employee emp2 = new Employee("Petkan", 24, true, 40);

		for (int i = 0; i < manyPeople.length; i++) {
			manyPeople[0] = person1;
			manyPeople[1] = person2;
			manyPeople[2] = ivancho;
			manyPeople[3] = petko;
			manyPeople[4] = emp1;
			manyPeople[5] = emp2;

			if (manyPeople[i] != null) {
				if (manyPeople[i] instanceof Person && !(manyPeople[i] instanceof Student)
						&& !(manyPeople[i] instanceof Employee)) {
					manyPeople[i].showPersonInfo();
				}

				if (manyPeople[i] instanceof Student) {
					((Student) manyPeople[i]).showStudentInfo();

				}
				if (manyPeople[i] instanceof Employee) {
					((Employee) manyPeople[i]).showEmployeeInfo();
				}

			}

		}

		for (int j = 0; j < manyPeople.length; j++) {
			if (manyPeople[j] != null) {
				if (manyPeople[j] instanceof Employee) {
					System.out.println(manyPeople[j].getName() + " have extra "
							+ +((Employee) manyPeople[j]).calculateOverTime(2) + " lv.");

				}

			}

		}

	}

}
