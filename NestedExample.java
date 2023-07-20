import java.util.Scanner;

class NestedExample{
	public static void main (String args[]){
	System.out.println("Enter your Age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
		if(age>=17){
	
			System.out.println("Enter your percentage");
			int percentage = sc.nextInt();
				if(percentage>=60){
					System.out.println("You are eligible");
				}
				else{
					System.out.println("Konjam nalla padikanum");
				}
		}
		else{
			System.out.println("Age does not match");	
		}
	}
}