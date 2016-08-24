package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.year = 2014;
		computer.price = 1200;
		computer.hardDiskMemory = 1000;
		computer.freeMemory = 200;
		computer.operationSystem = "Windows 7";
		computer.useMemory(100);
		System.out.println("Computer is created in: " + computer.year + " year."+
				" Price is: " + computer.price + " lv. " + "Hard disc memory is: " +
				computer.hardDiskMemory + " GB." + "\nOperation system on computer is: "+
				computer.operationSystem + "." + " Free memory on computer is: "+
				computer.freeMemory+" GB. "+" Is this a notebook?  " + computer.isNoteBook);
		
		
		Computer laptop = new Computer();
		laptop.isNoteBook = true;
		laptop.year = 2015;
		laptop.price = 1500;
		laptop.hardDiskMemory = 1200;
		laptop.freeMemory = 400;
		laptop.operationSystem = "Windows 8";
		laptop.changeOperationSystem("Windows 10");
		System.out.println();
		System.out.println("Computer is created in: " + laptop.year + " year."+
				" Price is: " + laptop.price + " lv. " + "Hard disc memory is: " +
				laptop.hardDiskMemory + " GB." + "\nOperation system on computer is: "+
				laptop.operationSystem + "." + " Free memory on computer is: "+
				laptop.freeMemory+" GB. "+" Is this a notebook?  " + laptop.isNoteBook);
	}

}
