import java.util.Scanner;

public class Ex11a {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int b;
			System.out.println("Enter number of rows: ");
			b = sc.nextInt();
			int z=1;

			  for (int i=0; i<b; i++)
			  {
			    for (int j=b; j>i; j--)
			    {
			      System.out.print(" ");
			    }
			    System.out.print("*");

			    if (i!=0)
			    {
			      for (int k=1; k<=z; k++)
			      {
			       System.out.print(" ");
			      }
			      System.out.println("*");
			      z+=2;
			    }
			    System.out.println();
			  }

			  for (int i=0; i<=z+1; i++)
			  {
			    System.out.print("*");
			  }
		}
}


