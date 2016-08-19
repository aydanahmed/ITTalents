package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	boolean turn;

	ElectronicSecuredNotepad(Page[] pages, String password) throws WrongPasswordException {
		super(pages,password);
		

	}

	@Override
	public void start() {
		if (turn == false) {
			turn = true;
		}

	}

	@Override
	public void stop() {
		if (turn == true) {
			turn = false;

		}

	}

	@Override
	public void isStarted() {
		if (turn == true) {
			System.out.println("Device is started. ");
			
		} else {
			System.out.println("Device is not started.");
			
		}
	}

	@Override
	public void addText(int pageNumber, String addNewText) {
		if (turn == true) {
			super.addText(pageNumber, addNewText);
		} 
	}

	@Override
	public void newText(int pageNumber, String addNewText) {
		if (turn == true) {
			super.newText(pageNumber, addNewText);

		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (turn == true) {
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void showAllPages() {
		if (turn == true) {
			super.showAllPages();
		} 
	}

	

	@Override
	public boolean searchWord(String word) {
		if (turn == true) {
			if(super.searchWord(word)==true){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (turn == true) {
			super.printAllPagesWithDigits();
		} 
	}

}
