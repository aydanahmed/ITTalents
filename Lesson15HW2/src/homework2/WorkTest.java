package homework2;

public class WorkTest {

	public static void main(String[] args) {
		Employee emp = new Employee("Ivan");
	    emp.setHoursLeft(4);
	  
		Task task = new Task("Izchistvane na zemqta", 7);
		emp.setCurrentTask(task);
		emp.showReport();
		System.out.println();
		Employee emp2 = new Employee("Petko");
		emp2.setHoursLeft(7);
		
		Task task1 = new Task("Boqdisvane na sgradata",8);
		emp2.setCurrentTask(task1);
		
		emp2.showReport();
		
		
	}

}
