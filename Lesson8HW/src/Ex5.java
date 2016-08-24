import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = -1,b = -1;
			
			System.out.println("Enter first word:");
			String firstWord = sc.nextLine();
			System.out.println("Enter second word:");
			String secondWord = sc.nextLine();
			char[][] crsWord = new char[secondWord.length()][firstWord.length()];
			for (int i = 0; i < firstWord.length(); i++) {
				for (int j = 0; j < secondWord.length(); j++) {
					if (firstWord.charAt(i) == secondWord.charAt(j)) {
						a = j;
						b = i;
						break;
					}
					if (a != -1 && b != -1) {
						break;
					}
				}
			}
			for (int i = 0; i <secondWord.length(); i++) {
				crsWord[i][b] = secondWord.charAt(i);
			}
			for (int j = 0; j < firstWord.length(); j++) {
				crsWord[a][j] = firstWord.charAt(j);
			}
			for (int i = 0; i < secondWord.length(); i++) {
				for (int j = 0; j < firstWord.length(); j++) {
					if(crsWord[i][j]==0){
						System.out.print(" ");
						continue;
					}
					System.out.print(crsWord[i][j]);
				}
				System.out.println();
			}
			sc.close();
		}
	}