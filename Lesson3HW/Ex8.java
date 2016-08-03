import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Please enter a number: ");
		a = sc.nextInt();
		b = a-1;
		c=1;
		for(int i=0; i<a; i++){
			b=b+2;
			c=b-2;
			System.out.print(c);
			
			for(int j =1; j<a; j++){
				System.out.print(c);
				
			}
			System.out.println();
				
			
			
		}

	}

}
