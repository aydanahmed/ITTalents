
public class Ex7 {

	public static void main(String[] args) {
		int[][] twoDim = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}	
		};
		int sumIndex = 0;
		int sumAll = 0;
		int sumAllElements =0;
		for(int i = 0 ; i < twoDim.length;i++){
			for(int j = 0 ; j<twoDim[i].length;j++){
				sumIndex = i + j;
				if(sumIndex%2==0){
					sumAll += twoDim[i][j];
					
					System.out.print(twoDim[i][j]+",");	
				}
			}
		sumAllElements +=sumAll;
		System.out.println(" Sum is: "+sumAll);
		sumAll=0;
		}
		System.out.println("Sum of elements are: "+sumAllElements);
		
		
	}
}
