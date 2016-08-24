import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println(a + "!" + " is " + factoriel(a));
		sc.close();
	}

	static int factoriel(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factoriel(n - 1);

	}
}
