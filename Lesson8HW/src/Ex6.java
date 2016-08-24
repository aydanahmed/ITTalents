import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words with space between them: ");
		String s1 = sc.nextLine();
		StringBuilder strBuild = new StringBuilder(s1);
		int a = 0;
		do {
		  strBuild.replace(a, a + 1, strBuild.substring(a,a + 1).toUpperCase());
		  a =  strBuild.indexOf(" ",a) + 1;
		} while (a > 0 && a < strBuild.length());

		System.out.println(strBuild.toString());
		sc.close();
	
	}
	
		
		

	

}
