import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,count;
		count=0;
		System.out.println("Please enter a number: ");
		a = sc.nextInt();
		for(int i = 1;i <=a;i++){
			count=count+i;
			
		}
		System.out.println("The result is: "+count);

	}

}
