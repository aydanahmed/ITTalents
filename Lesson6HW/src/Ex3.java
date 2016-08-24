
public class Ex3 {

	public static void main(String[] args) {
		int[][] matrix = {
				{48,72,13,14},
				{21,22,11,12},
				{15,14,12,13},
				{19,1,2,12},
				{3,6,5,4}
						
		};
		int sum =0;
		double avg = 0;
		double counter = 0;
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0 ; j<matrix[i].length;j++){
				counter++;
				sum += matrix[i][j];
				
			}
		}
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0 ; j<matrix[i].length;j++){
				avg = sum/counter;
				
			}
		}
		System.out.println("Sum from elements is: "+sum);
		System.out.println("Average from elements is: "+avg);
	}



}


