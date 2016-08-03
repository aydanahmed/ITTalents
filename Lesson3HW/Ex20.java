
public class Ex20 {

	public static void main(String[] args) {
		int min =1;
		int max =9;
		for(int i=min;i<=max;i++){
			for(int j=i;j<=max;j++){
				System.out.print(j);
				
			}
			for(int k=0;k<i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
		for(int x=0;x<=9;x++){
			System.out.print(x);
		}
	}

}
