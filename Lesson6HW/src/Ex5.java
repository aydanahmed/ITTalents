
public class Ex5 {

	public static void main(String[] args) {
		int[][] mat = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int sumRow = 0;
		int maxRow =0;
		for(int i = 0; i <mat.length;i++){
			 for(int j = 0;j<mat[i].length;j++){
				sumRow += mat[i][j];
			 }
			 if(maxRow<sumRow){
				 maxRow=sumRow; 
			 }
			 sumRow=0;
		 }
		System.out.println("The biggest sum of rows is: " + maxRow);
		int sumCol = 0;
		int maxCol=0;
		for(int j = 0; j <mat[0].length;j++){
			 for(int i = 0;i<mat.length;i++){
				sumCol += mat[i][j]; 
			 }
			 if(maxCol<sumCol){
				 maxCol=sumCol; 
			 }
			 sumCol=0;
		}
		System.out.println("The biggest sum of columns is: " +maxCol);
		System.out.println(maxRow>maxCol ? "Max sum of row is bigger than > Max sum of columns":"Max sum of columns is bigger than > Max sum of rows");

	}

}
