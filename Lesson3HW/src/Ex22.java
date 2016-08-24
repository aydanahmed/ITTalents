import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,c;
		a=1;
		System.out.println("Enter a number: ");
		c = sc.nextInt();
			while(c<=999 && c>=1 && a<=10){
				if(c%2==0||c%3==0||c%5==0){
					System.out.print(a + ":" + c+ "," );
					a++;
						
				}
				c++;
				
			}
				
	}

}
