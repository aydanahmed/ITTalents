import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum,sub,mul,mod,div;
		System.out.println("Enter first number:" );
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();
		sum = a+b;
		sub = a - b;
		mul = a*b;
		mod = a%b;
		div = a/b;
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + sub);
		System.out.println("Product is: " + mul);
		System.out.println("Remainder is: " + mod);
		System.out.println("Quotient is: " + div);
		sc.close();
	}

}
