import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter number A: ");
		a = sc.nextDouble();
		System.out.println("Enter number B: ");
		b = sc.nextDouble();
		System.out.println("Enter number C: ");
		c = sc.nextDouble();
		boolean check = ((a<c) && (b>c))||((c<a)&&(c>b));
		if(check == true){
			System.out.println("Number " + c + " is between " + a +  " and " + b);
		}else{
			System.out.println("Number " + c + " is not between " + a +  " and " + b);
		}
	sc.close();
	}

}
