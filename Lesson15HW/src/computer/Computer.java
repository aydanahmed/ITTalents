package computer;

public class Computer {
	int year;
	double price;
	boolean isNoteBook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	
	Computer(){
		isNoteBook = false;
		operationSystem = "Windows XP";	
	}
	
	Computer(int year, double price, double hardDiskMemory,double freeMemory,String operationSystem){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price){
			System.out.println("Expensive is computer with price: " +this.price+" lv.");
			return -1;
		}
		
		if(this.price<c.price){
			System.out.println("Expensive is computer with price: " + c.price+" lv.");
			return 1;
		}
		if(this.price==c.price){
			System.out.println("Two computers have equal price.");
			return 0;
		}
		return -2;
	}
	
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

