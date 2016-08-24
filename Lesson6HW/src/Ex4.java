import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
	    int[][] copyMatrix = new int[matrix.length][matrix[0].length];
	    for (int row = 0; row < matrix.length; row++) {
	        for (int col = 0; col < matrix[0].length; col++) {
	            copyMatrix[col][matrix.length-1-row] = matrix[row][col];
	        }
	    }
		for(int i = 0; i <matrix.length;i++){
			for(int j = 0; j <matrix[i].length;j++){ 
				System.out.print(copyMatrix[i][j]+",");
			}
		System.out.println();
		}
	}
		 
		 
}	 
		      

		       
		    
	
