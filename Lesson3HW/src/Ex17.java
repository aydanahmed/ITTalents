import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Please enter a number: ");
		        int a = sc.nextInt();
		        String sym = "";
		        System.out.print("Enter a symbol: ");
		        sym = sc.next();

		        for (int i = 1; i <= a; i++) {
		            for (int j = 1; j <= a; j++) {
		                if (i == 1 || i == a || j == 1 || j == a){
		                    System.out.print("*");
		                }else{
		                    System.out.print(sym);
		                }
		            }
		            System.out.println();
		        }
	}
}
