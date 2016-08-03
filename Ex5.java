import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		if((a>b)&& (a>c) &&(b>c)){
			System.out.println(a + " " + b + " " + c);
		}
		if ((b>a)&&(b>c)&&(a>c)){
			System.out.println(b + " " + a + " " + c);
		}
		if ((c>a)&&(c>b)&&(a>b)){
			System.out.println(c + " " + a + " " + b);
		}
		if((a>b)&& (a>c)&&(c>b)){
			System.out.println(a + " " + c + " " + b);
		}
		if ((b>a)&&(b>c)&&(c>a)){
			System.out.println(b + " " + c + " " + a);
		}
		if ((c>a)&&(c>b)&&(b>a)){
			System.out.println(c + " " + b + " " + a);
		}
		sc.close();
	}

}
