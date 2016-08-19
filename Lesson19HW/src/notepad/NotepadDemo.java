package notepad;

public class NotepadDemo {
	public static void main(String[] args) {
		Page firstPage = new Page("Zapoznanstvo", "Kak si?");
		Page secondPage = new Page("Obrecheni", "Kakvo stava?");
		Page thirdPage = new Page("Lyubovna igra", "Lyubovta e golqma maka. Petak 13.");
		Page fourthPage = new Page("Game of thrones", "Game for kings 1 2 3 4 5");
		Page fifthPage = new Page("The king", "King kong bong is 1923");
		Page[] pages = { firstPage, secondPage, thirdPage, fourthPage, fifthPage };

		SimpleNotepad simpleNotepad = new SimpleNotepad(pages);
		simpleNotepad.newText(1, "Kakvo pravish?");
		simpleNotepad.deleteText(2);
		simpleNotepad.showAllPages();

		Page firstPage1 = new Page("Pokemon", "Istoriqta na pokemon zapochva prez 1997 godina.");
		Page secondPage2 = new Page("Lyubov", "Lyubov ot prav pogled - Istina ili laja?");
		Page thirdPage3 = new Page("Grande", " Petak 13 e grande den.");
		Page fourthPage4 = new Page("Game of pokemons", "Game for kings 1 2 3 4 5");
		Page fifthPage5 = new Page("The lover", "King kong bong is 1923");
		Page[] morePages = { firstPage1, secondPage2, thirdPage3, fourthPage4, fifthPage5 };

		System.out.println("---------------------------------------------------");

		try {
			ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad(morePages, "a14dA");
			electronicNotepad.start();
			electronicNotepad.isStarted();
			electronicNotepad.showAllPages();
			electronicNotepad.printAllPagesWithDigits();

		} catch (WrongPasswordException e) {
			System.out.println("Wrong Password");
		}

	}
}
