package notepad;

public class Page {
	String title;
	String someText;

	Page(String title, String someText) {
		if (title != null && !title.isEmpty()) {
			this.title = title;

		}
		if (someText != null && !someText.isEmpty()) {
			this.someText = someText;

		}

	}

	void addText(String addText) {
		someText = someText + " " + addText;
	}

	void deleteText() {
		someText = "";
	}

	void showPage() {
		System.out.println("Title of page is: " + title);
		System.out.println("Text on page: " + someText);
	}
	boolean searchWord(String word){
		if(someText.contains(word)){
			return true;
			
		}else{
			return false;
		}
	
	}
	
	boolean containsDigits(){
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		for(int i = 0 ; i < numbers.length;i++){
			if(someText.contains(numbers[i])){
				return true;		
			}
			
		}
		return false;
		
		
	}
	
	
}
