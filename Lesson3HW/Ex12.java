
public class Ex12 {

	public static void main(String[] args) {
		int a,b,c;
		
		for(int i=100;i<=999;i++){
			a = i%10;
			b = i/100;
			c = (i/10)%10;
			if(a==b || b==c || c==a){
				continue;
			}
			System.out.println(i);
			
		}

	}

}
