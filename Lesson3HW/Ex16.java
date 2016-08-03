import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter first number between 10 and 5555: ");
		n = sc.nextInt();
		System.out.println("Enter second number between 10 and 5555: ");
		m=sc.nextInt();
		
		if(n>m){
			n = n - m;
			m = n+m;
			n = m-n;
		}
		if(n>=10&&m<=5555){
			for(int i = m; i>=n;i--){
				if(i%50==0){
				System.out.print(i + ",");
				}
			}	
		}else{
			System.out.println("Number is not between 10 and 5555.");
		}
	}

}
