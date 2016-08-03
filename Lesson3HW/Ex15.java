import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int a = sc.nextInt();
		
		int count=0;
		do{
			count=count+a;
			a--;
		}while(a>0);
		System.out.println(count);
	}

}
