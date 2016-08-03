import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day,month,year,check,check1,check2;
		System.out.println("Enter day: ");
		day = sc.nextInt();
		System.out.println("Enter mouth: ");
		month = sc.nextInt();
		System.out.println("Enter year: ");
		year = sc.nextInt();
		check = year%4;
		check1 = year%100;
		check2 = year%400;
		
		if(day==31 && (month==1||month==3||month==5||month==7||month==8||month==10)){
			
			day = 1;
			month ++;
			System.out.println(day + " , " + month + "," + year);
			
		}
		if(day==30 && (month==1||month==3||month==5||month==7||month==8||month==10||month==12)){
			day = 31;
			System.out.println(day + " , " + month + "," + year);
			
		}
		if(day==31 && month==12){
			
			day = 1;
			month = 1;
			year ++;
			System.out.println(day + " , " + month + "," + year);
			
		}
		
		if(day==30 && (month==4||month==6||month==9||month==11)){
				
			day =1;
			month ++;
			System.out.println(day + " , " + month + "," + year);
		
		}
			
		
		if ((check==0||check2==0)&& (month==2&&day==29)){
			day=1;
			month ++;
			System.out.println(day + " , " + month+ " , "  + year);
			
			
		}
		
		if ((check==0||check2==0)&& (month==2&&day==28)){
			day++;
			System.out.println(day + " , " + month+ " , "  + year);
		}
		
		if((check>0||check2>0 ||check1==0)&&(month==2&&day==28)){
			day=1;
			month ++;
			System.out.println(day + "," + month + "," + year);
		}
		
		if(day>1 && day<=30 &&(month!=2&&month!=3)&&(check>=0||check2>=0||check==0) ){
			day++;
			System.out.println(day + "," + month + "," + year);
		}
		if(day>1 && day<=27 &&(month==2)&&(check>=0||check2>=0||check==0) ){
			day++;
			System.out.println(day + "," + month + "," + year);
		}
		if(day>1 && day<=29 &&(month==3)&&(check>=0||check2>=0||check==0) ){
			day++;
			System.out.println(day + "," + month + "," + year);
		}
		
		
		
		sc.close();
	}

}
