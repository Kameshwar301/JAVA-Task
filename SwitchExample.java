import java.util.Scanner;

class SwitchExample{
	public static void main(String args[]){
	System.out.println("Enter your day number");
	Scanner sc = new Scanner(System.in);
	int day = sc.nextInt();
		switch(day){
			case 1:
				System.out.println("your case 1 day is Sunday");
			break;
			case 2:
				System.out.println("your case 2 day is Monday");
			break;
			case 3:
				System.out.println("your case 3 day is Tuesday");
			break;
			case 4:
				System.out.println("your case 4 day is Wednesday");
			break;
			case 5:
				System.out.println("your case 5 day is Thursday");
			break;
			case 6:
				System.out.println("your case 6 day is Friday");
			break;
			case 7:
				System.out.println("your case 7 day is Saturday");
			break;
			default:
			System.out.println("There is no days");
		}
	
	}

}