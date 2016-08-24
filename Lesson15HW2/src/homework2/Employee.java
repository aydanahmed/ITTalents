package homework2;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;// hours for day
	Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	void work() {
		if (this.hoursLeft <= currentTask.getWorkingHours()) {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
			setHoursLeft(0);
		} else {
			setHoursLeft(this.hoursLeft - currentTask.getWorkingHours());
			currentTask.setWorkingHours(0);
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	void showReport() {
		this.work();
		System.out.println("Name of employee is: " + this.getName());
		System.out.println("Task name is: " + currentTask.getName());
		System.out.println("Hours left for task: " + currentTask.getWorkingHours());
		System.out.println("Hours left for work: " + this.getHoursLeft());

	}

}
