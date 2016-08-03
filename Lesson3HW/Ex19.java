import java.util.Scanner;


public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number between 10 and 99: ");
		a = sc.nextInt();
		
		while(a>0){
			if(a%2==0){
				a*=0.5;
				System.out.print(a + ",");
				if(a==1){
					break;
				}
			}
			if(a%2==1){
				a=a*3;
				a++;
				System.out.print(a + ",");
			}
			
			
		}
		
	
	}

}
