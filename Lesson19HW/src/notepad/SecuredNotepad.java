package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	protected String password;

	SecuredNotepad(Page[] pages, String password) throws WrongPasswordException {
		super(pages);
		String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		boolean checkForUpperLetters = false;
		boolean checkForLowerLetters = false;
		boolean checkForNumbers = false;
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < upperLetters.length(); j++) {
				if (password.charAt(i) == upperLetters.charAt(j)) {
					checkForUpperLetters = true;
					break;
				}
			}
		}
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < lowerLetters.length(); j++) {
				if (password.charAt(i) == lowerLetters.charAt(j)) {
					checkForLowerLetters = true;
					break;
				}
			}
		}
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < numbers.length(); j++) {
				if (password.charAt(i) == numbers.charAt(j)) {
					checkForNumbers = true;
					break;
				}
			}
		}

		if (password.isEmpty() || password == null || password.length() <= 4 || checkForNumbers == false
				|| checkForLowerLetters == false || checkForUpperLetters == false) {
			throw new WrongPasswordException();

		}else{
			this.password = password;
		}

	}

	@Override
	public void addText(int pageNumber, String addNewText) {
		if (checkPassword() == true) {
			super.addText(pageNumber, addNewText);
		} else {
			System.out.println("Sorry wrong password");
		}
	}

	@Override
	public void newText(int pageNumber, String addNewText) {
		if (checkPassword() == true) {
			super.newText(pageNumber, addNewText);
		} else {
			System.out.println("Sorry wrong password");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (checkPassword() == true) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("Sorry ! Enter your password. ");
		}
	}

	@Override
	public void showAllPages() {
		if (checkPassword() == true) {
			super.showAllPages();
		} else {
			System.out.println("Sorry wrong password");
		}
	}

	@Override
	public boolean checkPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String entPassword = sc.nextLine();
		if (entPassword.equals(this.password)) {

			return true;
		} else {

			return false;
		}

	}

	@Override
	public boolean searchWord(String word) {
		if (checkPassword() == true) {
			if (super.searchWord(word) == true) {
				return true;
			}
		} else {
			System.out.println("Wrong password.");
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (checkPassword() == true) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Sorry wrong password");
		}

	}

}
