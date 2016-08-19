package notepad;

public class SimpleNotepad implements INotepad {
	Page[] pages;

	SimpleNotepad(Page[] pages) {
		this.pages = pages;
	}

	@Override
	public void addText(int pageNumber, String addNewText) {
		if (pageNumber>=1&&pageNumber <= pages.length) {
			pages[pageNumber-1].addText(addNewText);
		} else {
			System.out.println("Page doesn't exit.");
		}
	}

	@Override
	public void newText(int pageNumber, String addNewText) {
		if (pageNumber>=1&&pageNumber <= pages.length) {
			pages[pageNumber-1].deleteText();
			pages[pageNumber-1].addText(addNewText);
		} else {
			System.out.println("Page doesn't exit!");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (pageNumber>=1&&pageNumber <= pages.length) {
			pages[pageNumber-1].deleteText();
		} else {
			System.out.println("Page doesn't exist");
		}

	}

	@Override
	public void showAllPages() {
		for (int i = 0; i < pages.length; i++) {
			int pageNumber = i+1;
			System.out.println("Page number: " + pageNumber);
			pages[i].showPage();

		}

	}

	@Override
	public boolean searchWord(String word) {
		for(int i = 0 ; i < pages.length;i++){
			if(pages[i].searchWord(word)==true){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i = 0 ;  i < pages.length;i++){
			if(pages[i].containsDigits()==true){
				pages[i].showPage();
			}
		}
		
	}
}
