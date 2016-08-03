import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		System.out.println("Enter hour between 0-24: ");
		hour = sc.nextInt();
		if ( hour>=4 && hour<9){
			System.out.println("Good morning!");
		}
		if( hour >=9 && hour <18){
			System.out.println("Good afternoon.");
		}
		if( (hour >18 && hour <=24)||(hour>=1 && hour<4)){
			System.out.println("Good night.");
		}
		sc.close();
	}

}
