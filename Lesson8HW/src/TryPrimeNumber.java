
public class TryPrimeNumber {

	public static void main(String[] args) {
		int a = 347;
		 boolean flag = true;
		for(int i = 2 ; i < a-1;i++){
			 flag= true;
			 if(a%i==0){
				flag= false;
				break;
			 }
			
		}
		if(isPrime(a, 2, a-1)==true){
			System.out.println("Not prime");
		}else{
			System.out.println("prime");
		}
		if(flag==true){
			System.out.println("Number is prime");
		}else{
			System.out.println("not prime");
		}
		

	}
	static boolean isPrime(int a,int i, int j){
		if(i==j){
			return false;
		}
		if(a%i==0){
			return true;
		}
		 
		return isPrime(a, i+1, j);
				
	}

}
