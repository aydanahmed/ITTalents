import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("Enter a1: ");
		a1 = sc.nextInt();
		System.out.println("Enter a2: ");
		a2 = sc.nextInt();
		System.out.println("Enter a3: ");
		a3 = sc.nextInt();
		a1 = a1+a2;
		a2 = a1 -a2;
		a1 = a1 - a2;
		a3 = a3+a2;
		a2 = a3 - a2;
		a3 = a3 - a2;
		System.out.println("New order is " + a1 + " " + a2 + " " + a3);
		sc.close();
	}

}
