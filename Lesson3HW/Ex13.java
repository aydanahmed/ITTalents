import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 2 and 27: ");
		int a = sc.nextInt();
		int b,c,d;
		if(a>=2 && a<=27){
			for(int i =101;i<=999;i++){
				b = i/100;
				c = i %10;
				d = (i/10)%10;
				if(a==b+c+d){
					System.out.print(i + ",");
				}
			}
		}else{
			System.out.println("Number is not between 2 and 27");
		}
	}

}
