import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		boolean res = true;
		a = sc.nextInt();
		for(int i =2;i<=a-1;i++){
			if(a%i==0){
			res = false;
			}
			
			
		}
		if(res ==true){
			System.out.println("Number is simple! ");
		}else{
			System.out.println("Number is not simple.");
		}
	}
}
