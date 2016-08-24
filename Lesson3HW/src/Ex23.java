
public class Ex23 {

	public static void main(String[] args) {
		int a,i;
		a=1;
		i=1;
		while(a<=9){
			i=a;
			while(i<=9){
				System.out.print(a + "*" + i + "=" +(a*i)+ " ");
				i++;
			}
		System.out.println(" ");
		a++;		
		}
	}

}
