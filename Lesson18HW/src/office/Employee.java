package office;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft = 8;// hours for day
	private AllWork allWork;

	Employee(String name) {
		if (!name.isEmpty() && name != null) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public AllWork getAllWork() {
		return allWork;
	}

	public void setAllWork(AllWork allWork) {
		if (allWork != null) {
			this.allWork = allWork;
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
		if (!allWork.isAllWorkDone() == true) {
			System.out.println(this.getName() + " starts to work.");
		}
		this.setCurrentTask(currentTask = allWork.getNextTask());
		if (currentTask != null) {
			System.out.println("He have to works on: " + currentTask.getName() + " ."
					+ "This task have to be finished for " + currentTask.getWorkingHours() + " hours.");

			if (this.getHoursLeft() <= this.getCurrentTask().getWorkingHours()) {

				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.hoursLeft);
				setHoursLeft(0);
				this.showReport();
				System.out.println(this.getName() + " left work.");
				this.startWorkingDay();
				System.out.println("New day in office begin for : " + this.getName());
				if (this.getCurrentTask().getWorkingHours() > 0) {
					this.setHoursLeft(this.hoursLeft - this.getCurrentTask().getWorkingHours());
					this.getCurrentTask().setWorkingHours(0);
					this.showReport();
					System.out.println(currentTask.getName() + " is finished from " + this.getName());
				}

			} else {
				System.out.println("Starts to work.");
				this.setHoursLeft(this.hoursLeft - currentTask.getWorkingHours());
				currentTask.setWorkingHours(0);
				this.showReport();
				System.out.println(currentTask.getName() + " is finished" + " from " + this.getName());
				currentTask = allWork.getNextTask();
				System.out.println(this.getName() + " is get new task with name " + currentTask.getName()
						+ " This task have to be finished for " + currentTask.getWorkingHours() + " hours.");
				if (this.getHoursLeft() > 0) {
					this.currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
					this.setHoursLeft(0);
					this.showReport();
					System.out.println(this.getName() + " left work.");
					this.startWorkingDay();
					if (allWork.isAllWorkDone() != true) {
						System.out.println("New day in office begin for: " + this.getName());
					}
				}
			}
		}

	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	void showReport() {
		System.out.println("Name of employee is: " + this.getName());
		System.out.println("Task name is: " + currentTask.getName());
		System.out.println("Hours left for task: " + currentTask.getWorkingHours());
		System.out.println("Hours left for work: " + this.getHoursLeft());

	}

	void startWorkingDay() {
		hoursLeft = 8;
	}

}
