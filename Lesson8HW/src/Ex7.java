import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words with space between them: ");
		String s1 = sc.nextLine();
		String[] names = s1.split(" ");
		int max = 0;
		for (int i = 0; i < names.length; i++) {
			if (max < names[i].length()) {
				max = names[i].length();
			}
		}

		System.out.println("The words are: " + names.length + "." + "The longest word have " + max + " symbols.");
		sc.close();
	}

}
