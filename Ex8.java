import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter number between 1000 - 9999: ");
		a = sc.nextInt();
		b = (((a / 1000)%10)*10) + (a%10);
		c = (((a/100)%10)*10) + ((a/10)%10);
		
		if ( b > c){
			System.out.println(b + ">" + c);
		}
		if ( b < c){
			System.out.println(b +"<" + c);
		}
		if (b == c){
			System.out.println(b + "=" + c);
			}
		sc.close();
		
	}
}
		
		
