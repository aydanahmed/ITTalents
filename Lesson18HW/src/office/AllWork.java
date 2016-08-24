package office;

public class AllWork {
	Task[] tasks;
	int freePlacesForTask;
	int currentUnassignedTask;

	public AllWork() {
		freePlacesForTask = 10;
		tasks = new Task[10];
		currentUnassignedTask = 0;
	}

	public void addTask(Task task) {
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] == null) {
				tasks[i] = task;
				freePlacesForTask--;
				break;
			}
		}
	}

	public Task getNextTask() {
		if (currentUnassignedTask >= 0 && currentUnassignedTask <= 9) {
			currentUnassignedTask++;
			return tasks[currentUnassignedTask - 1];
		} else {
			return null;
		}

	}

	boolean isAllWorkDone() {
		int counter = 0;
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] != null) {
				if (tasks[i].getWorkingHours() == 0) {
					counter++;
				}
			}
		}
		if (counter == tasks.length) {
			return true;
		} else {
			return false;
		}

	}

}