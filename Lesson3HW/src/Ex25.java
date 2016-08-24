import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,counter;
		counter =1;
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		do{
			counter *=a;
			a--;
		}while(a>0);
		System.out.println("n! = "+ counter);
	}

}
