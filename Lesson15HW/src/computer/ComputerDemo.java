package computer;
public class ComputerDemo {

	public static void main(String[] args) {
		Computer computer = new Computer(1994,1000,1024,300,"Windows 8");
		
		System.out.println("Computer is created in: " + computer.year + " year."+
				" Price is: " + computer.price + " lv. " + "Hard disc memory is: " +
				computer.hardDiskMemory + " GB." + "\nOperation system on computer is: "+
				computer.operationSystem + "." + " Free memory on computer is: "+
				computer.freeMemory+" GB. "+" Is this a notebook?  " + computer.isNoteBook);
		
		
		Computer laptop = new Computer(2001,1400,2000,200,"Windows 10");
		laptop.isNoteBook = true;
		
		System.out.println();
		System.out.println("Computer is created in: " + laptop.year + " year."+
				" Price is: " + laptop.price + " lv. " + "Hard disc memory is: " +
				laptop.hardDiskMemory + " GB." + "\nOperation system on computer is: "+
				laptop.operationSystem + "." + " Free memory on computer is: "+
				laptop.freeMemory+" GB. "+" Is this a notebook?  " + laptop.isNoteBook);
	
		System.out.println();
		computer.comparePrice(laptop);
	
	
	}

}



