
public class Ex1 {

	public static void main(String[] args) {
		int[][] matrix = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}		
		};
		int max =0;
		int min = matrix[0][0];
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0 ; j<matrix[i].length;j++){
				if(matrix[i][j]>max){
					max = matrix[i][j];
				}
				if(matrix[i][j]<min){
					min = matrix[i][j];
				}
			}
			
			
			
		}
		System.out.println("The smallest number is: "+min);
		System.out.println("The bigger number is: "+max);
	}

}
