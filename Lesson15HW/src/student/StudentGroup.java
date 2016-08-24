package student;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		groupSubject = subject;
	}

	void addStudent(Student s) {

		for (int i = 0; i < students.length; i++) {

			if (s.getSubject().equalsIgnoreCase(groupSubject) && freePlaces != 0) {
				if (students[i] == null) {
					students[i] = s;
					freePlaces--;
					break;
				}
			}

		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent(StudentGroup group) {
		double max = group.students[0].getGrade();
		int a = 0;
		for (int i = 0; i < group.students.length; i++) {
			if (students[i] != null) {
				if (max < group.students[i].getGrade()) {
					max = group.students[i].getGrade();
					a = i;

				}
			}
		}

		return group.students[a].getName();

	}

	void printStudentsInGroup() {
		for (int k = 0; k < students.length; k++) {
			if (students[k] != null) {
				System.out.println("Name of student is: " + students[k].getName() + " Students age is: "
						+ students[k].getAge() + " Student grade is: " + students[k].getGrade() + " Student money is: "
						+ students[k].getMoney() + " Student studies subject is: " + students[k].getSubject()
						+ " Student year in college is: " + students[k].getYearInCollege());
				System.out.println();
			}
		}
		System.out.println("Free places in group is: " + freePlaces);
	}

}
