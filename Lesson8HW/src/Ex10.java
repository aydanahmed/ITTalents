import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter symbols: ");
		String str = sc.nextLine();
		for(int i = 0 ; i < str.length();i++){
			char newLetter = (char)(5 + (int)str.charAt(i));
			System.out.print(newLetter);
		}
		System.out.println();
		sc.close();
	}

}
