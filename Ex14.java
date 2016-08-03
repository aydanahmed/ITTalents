import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter 2 possitions between 0-8: ");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Enter more 2 possitions  between 0-8: ");
	c=sc.nextInt();
	d=sc.nextInt();
	e = (a + b) % 2;
	d = (c + d) % 2;
	if(e==0 && d==0){
		System.out.println("Possitions are with same colour.");
	}
	if(e !=0 || d !=0){
		System.out.println("Possitions aren't with same colour.");
	}
	sc.close();
	
	}
	
}
