import java.util.Scanner;

public class TryTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a;i<=b;i++){
			for(int j = b-(b-i);j>=i;j--){
				System.out.println((i-1)+" "+j+" "+(j+1));
			}
		}
		//System.out.println(retNumbers(a,b,a+1,2));
		
		
	}
	static int retNumbers(int a, int b,int c,int d){
		if(a==b){
			return b;
		}
		if(a!=c){
			System.out.println(d+" "+a+" "+ c);
		}
		
		return retNumbers(a+1, b,c+1,d+1);
		
		
		
		
	}
	
	
	

}
