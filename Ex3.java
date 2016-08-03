import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		a = a +b;
		b = a - b;
		a = a  - b ;
		System.out.println("New possition of numbers is: " + a + " " + " " + b);
		sc.close();
	}

}
