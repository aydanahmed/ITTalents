package office;

public class Test {
	public static void main(String[] args) {

		Task task1 = new Task1("Zadacha 1", 10);
		Task task2 = new Task2("Zadacha 2", 7);
		Task task3 = new Task3("Zadacha 3", 1);
		Task task4 = new Task4("Zadacha 4", 6);
		Task task5 = new Task5("Zadacha 5", 2);
		Task task6 = new Task6("Zadacha 6", 11);
		Task task7 = new Task7("Zadacha 7", 12);
		Task task8 = new Task8("Zadacha 8", 5);
		Task task9 = new Task9("Zadacha 9", 3);
		Task task10 = new Task10("Zadacha 10", 8);
		Employee emp = new Employee("Ivan");
		AllWork inOffice = new AllWork();
		inOffice.addTask(task1);
		inOffice.addTask(task2);
		inOffice.addTask(task3);
		inOffice.addTask(task4);
		inOffice.addTask(task5);
		inOffice.addTask(task6);
		inOffice.addTask(task7);
		inOffice.addTask(task8);
		inOffice.addTask(task9);
		inOffice.addTask(task10);
		emp.setAllWork(inOffice);
		Employee emp2 = new Employee("Gosho");
		emp2.setAllWork(inOffice);

		Employee emp3 = new Employee("Nikolay");
		emp3.setAllWork(inOffice);

		while (true) {
			for (int i = 0; i < inOffice.tasks.length; i++) {
				emp.work();
				emp2.work();
				emp3.work();
			}
			if (inOffice.isAllWorkDone() == true) {
				System.out.println("All tasks were finished.");
				break;
			}
		}

	}
}
