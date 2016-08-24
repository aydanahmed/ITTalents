package student;

public class College {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan","Biologiq",25);
		student1.receiveSchoolarship(student1.getGrade(), 100);
		Student student2 = new Student("Petko","Biologiq",22);
		student2.setGrade(3.50);
		student2.receiveSchoolarship(student2.getGrade(), 100);//no schoolar ship for students with smaller than 4.00 grade
		Student student3 = new Student("Vasil","Biologiq",21);
		Student student4 = new Student("Nihat","Biologiq",20);
		student4.setGrade(5.23);
		student4.setYearInCollege(3);
		student4.upYear();
		Student student5 = new Student("Ivan","Biologiq",19);
		student5.setGrade(6.00);
		Student student6 = new Student("Osman","Biologiq",20);
		StudentGroup group48 = new StudentGroup("Biologiq");
		group48.addStudent(student1);
		group48.addStudent(student2);
		group48.addStudent(student3);
		group48.addStudent(student4);
		group48.addStudent(student5);
		group48.addStudent(student6); //no more free spaces in group.. cant be added
		System.out.println("The best student from group48 is: " +group48.theBestStudent(group48));
		group48.printStudentsInGroup();
		
		Student student7 = new Student("Aydun","Java",22);
		student7.setGrade(5.50);
		Student student8 = new Student("Iliqna","Java",20);
		student8.setGrade(5.90);
		Student student9 = new Student("Ivan","Java",23);
		student9.setGrade(5.84);
		Student student10 = new Student("Georgi","Java Script",22);
		student10.setGrade(5.00);
		Student student11 = new Student("Petko","Java",23);
		Student student12 = new Student("Hristo","Java Script",22);
		student12.setGrade(4.23);
		student12.setYearInCollege(2);
		student12.upYear();
		
		StudentGroup java = new StudentGroup("Java");
		java.addStudent(student7);
		java.addStudent(student8);
		java.addStudent(student9);
		java.addStudent(student10);//cant be added..
		java.addStudent(student11);
		java.addStudent(student12);//cant be added .. 
		java.printStudentsInGroup();
		System.out.println("The best student from Java group is: "+java.theBestStudent(java));
		
		StudentGroup javaScript = new StudentGroup("Java Script");
		javaScript.addStudent(student10);
		javaScript.addStudent(student12);
		javaScript.printStudentsInGroup();
		System.out.println("The best student from java script group is: "+javaScript.theBestStudent(javaScript));
		
		
		
		
	}

}
