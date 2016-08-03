import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter 3 digits number: ");
		a = sc.nextInt();
		b = (a/100)%10;
		c = (a/10)%10;
		d = a%10;
		if(b == c && c == d){
			System.out.println("Numbers are equal.");
			
		}
		if( b<c && c<d){
			System.out.println("Numbers are in ascending order.");
		}
		if(b>c && c>d){
			System.out.println("Numbers are in descending order.");
		}
		if((b>c && c<d)||(b<c && c>d)){
			System.out.println("Numbers are not equal,not in ascsending orded and not in descending order.");
			
		}
		sc.close();
	}
}
