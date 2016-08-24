import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,x,c;
		x = 0;
		System.out.println("Enter a number between 10 and 30000: ");
		n = sc.nextLong();
		c = n;
		if(n>=10 && n<=30000){
			do{
				x = x*10 + c%10;
				c = c/10;
			}while(c>0);
		
			if(x==n) {
				System.out.println("The number is polyndrom.");
			}else{
				System.out.println("The number is not polyndrom.");
				
			}
		}else{
			System.out.println("Number is not between 10 and 30000.");
		}
	}
		

}
