import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Please enter first number: ");
		a = sc.nextInt();
		System.out.println("Please enter second number: ");
		b = sc.nextInt();
		
		for(int i = 1;i<=b;i++){
			
		
			for(int j=1;j<=(a*b)/b;j++){
				System.out.println(i + "*"+ j+"="+(i*j));
			}
			
	
		}

	}
}
