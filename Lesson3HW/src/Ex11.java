import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows,stars;
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter number of stars: ");
		stars = sc.nextInt();
		
		for (int row =1; row<=rows;row++){
			for(int j=1;j<=rows-row;j++){
				System.out.print(" ");
			}
			for(int k = 1;k<=stars;k++){
				System.out.print("*");
			}
			
			System.out.println();
			stars+=2;
		}

	}

}
