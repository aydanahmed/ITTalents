package notepad;

public interface INotepad {
	void addText(int pageNumber,String addNewText);
	void newText(int pageNumber,String addNewText);
	void deleteText(int pageNumber);
	void showAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
	
}
