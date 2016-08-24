import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Please enter a first number: ");
		a = sc.nextInt();
		System.out.println("Please enter a second number: ");
		b = sc.nextInt();
		if (a>b){
			a = a-b;
			b = a+b;
			a = b-a;
			
		}
		for(int i =a;i<=b;i++){
			System.out.print(i + " ");
		}

	}

}
