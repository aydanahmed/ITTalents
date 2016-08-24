import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<matrix.length;i++){
			for(int j =0 ; j<matrix[i].length;j++){
				System.out.print("Enter a value for matrix: ");
				matrix[i][j]=sc.nextInt();
				
			}
		}
		System.out.print("Elements on main diagonal are: ");
		for(int i = 0;i<matrix.length;i++){
			for(int j =i ; j<=i;j++){
				System.out.print(matrix[i][j]+" ");
					
			}
		}
		System.out.println();
		System.out.print("Elements on second diagonal are: ");
		for(int i = 0;i<matrix.length;i++){
			for(int j =0 ; j<matrix[i].length;j++){
				if(i+j==matrix.length-1){
					System.out.print(matrix[i][j]+" ");
				}
			
			
			}
		}
	}
}
