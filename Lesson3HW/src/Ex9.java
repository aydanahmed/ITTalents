import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,x,sum;
		sum =0;
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		if(a>b){
			a = a-b;
			b = b+a;
			a = b-a;
		}
		for(int i = a;i<=b;i++){
			x = i * i;
			
			if ( x % 3 ==0){
				System.out.print("skip 3" + ",");
			}
			if ( x % 3 !=0){
				sum =sum+x;
				System.out.print(x + ",");
				
				
			
			
			}
		}
		
			
			
			
		
	}

}
