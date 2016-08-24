import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		if ( a>b){
			System.out.println("Ascending order: " + b + " " + a);
		}else {
			System.out.println("Ascending order: " + a + " " + b);
		}
		sc.close();
	}

}
