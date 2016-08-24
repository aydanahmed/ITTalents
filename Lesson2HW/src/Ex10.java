import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter quantity litters between 10-9999: ");
		a = sc.nextInt();
		b = a /5;
		c = a/ 5;
		d = a %5;
		
		if(d==0){
			System.out.println(b + "x2 litters buckets " + "\n" + c + "x3 litters buckets" );
			System.out.println("don't add bucket");
		}
		if(d==1){
			System.out.println(b + "x2 litters buckets " + "\n" + c + "x3 litters buckets" );
			System.out.println("add 1 litter bucket ");
		}
		
		if(d==2){
			
			System.out.println(b + "x2 litters buckets " + "\n" + c + "x3 litters buckets" );
			System.out.println("add 2 litter bucket ");
		}
		if ( d==3){
			System.out.println(b + "x2 litters buckets " + "\n"+c+ "x3 litters buckets");
			System.out.println("add 3 litter bucket");
		}
		if (d==4){
			b = b +1;
			System.out.println(b + "x2 litters buckets " + "\n"+c + "x3 litters buckets");
			System.out.println("add 2 litter bucket");
		}
		sc.close();
	}

}
