import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		System.out.println("Enter temperature between [-100,100]: ");
		t = sc.nextInt();
		if(t<-20){
			System.out.println("Freezing.");
		}
		if(t>=-20 && t<0){
			System.out.println("Cold.");
		}
		if(t>=0 && t <15){
			System.out.println("Cool.");
		}
		if(t>=15 && t<25){
			System.out.println("Warm.");
		}
		if(t>=25){
			System.out.println("Hot.");
		}
		sc.close();
	}
}
