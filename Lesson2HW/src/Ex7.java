import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		double money;
		boolean health;
		System.out.println("Enter hour: ");
		hour = sc.nextInt();
		System.out.println("How much money u have? ");
		money = sc.nextDouble();
		System.out.println("Are u healthy? true/false");
		health = sc.nextBoolean();
		if (health == true && money >=10){
			System.out.println("Im healthy, i will go to cinema with my friends. ");
			
		} 
		
		if(health == true && money < 10){
			System.out.println("I am healthy, but i dont have enough money, for that I go to cafe.");
			
		}
		
		if(health == false && money > 0){
			System.out.println("I'm sick. I don't go out");
			System.out.println("I will buy drugs .");
		}
		if(money <= 0 && health == false){
			System.out.println("I'm sick. I will stay at home. I will drink tea.");
		}
			
		sc.close();
	}

}
