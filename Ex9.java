import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,check,check1;
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		c = a*b;
		d = c % 10;
		check = d % 2;
		check1 = c %2;
		if((check > 0) && (check1 > 0)){
			System.out.println(c + "," + d +" ODD.");
		}else{
			System.out.println(c + "," + d +" Even.");
		}
		sc.close();
	}

}
