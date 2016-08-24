import java.util.Scanner;

public class Ex2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,sum,sub,mul,mod,div;
		System.out.println("Enter first number:" );
		a = sc.nextDouble();
		System.out.println("Enter second number:");
		b = sc.nextDouble();
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
