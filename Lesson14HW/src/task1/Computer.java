package task1;

public class Computer {
	int year;
	double price;
	boolean isNoteBook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory <= freeMemory) {
			this.freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory.");
		}
	}

}
