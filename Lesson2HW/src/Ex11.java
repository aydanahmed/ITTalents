import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,check,check1,check2;
		System.out.println("Enter 3 digits number without using 0: ");
		a = sc.nextInt();
		b = ((a/100)%10);
		c = (a/10)%10;
		d = a %10;
		check = a%b;
		check1 = a % c;
		check2 = a % d;
		boolean res = ((check > 0)||(check1>0))||(check2>0);
		if(res==false){
			System.out.println(a + " can be divided on 3 digits.");
		}else{
			System.out.println(a + " can't be divided on 3 digits.");
		}
		sc.close();
	}

}
