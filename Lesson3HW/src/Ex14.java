import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number between 10-200: ");
		a = sc.nextInt();
		if(a>=10 && a<=200){
			for(int i =a;i>=1;i--){
				
				if(i%7==0){
					System.out.println(i);
				}
				
			}	
			
			
		}else{
			System.out.println("Number is not between 10 - 200.");
		}
		

	}

}
