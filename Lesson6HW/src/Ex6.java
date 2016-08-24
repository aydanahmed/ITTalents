
public class Ex6 {

	public static void main(String[] args) {
		int[][] twoDim = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}	
		};
		int sumRow=0;
		int sumAll=0;
		for(int i = 1 ; i < twoDim.length;i+=2){
			sumRow=0;
			for(int j = 0 ; j<twoDim[i].length;j++){
				sumRow += twoDim[i][j];
				System.out.print(twoDim[i][j] + ",");
			}
			sumAll +=sumRow;
			System.out.print(" Sum is: "+sumRow);
			System.out.println();
			
			
		}
		System.out.println("All sum is: " + sumAll);

	}

}
