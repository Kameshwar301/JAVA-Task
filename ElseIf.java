import java.util.Scanner;

class ElseIf{
	public static void main(String args[]){
	System.out.println("Enter your mark");
	Scanner sc = new Scanner(System.in);
	int mark = sc.nextInt();
	if((mark>=0)&&(mark<=39)){
	System.out.println("your grade is D");
	}
	else if((mark>=40) && (mark<=59)){
	System.out.println("Your grade is C");
	}
	else if((mark>=60) && (mark<=79)){
	System.out.println("Your grade is B");
	}
	else if((mark>=80) && (mark<=89)){
	System.out.println("Your grade is A");
	}
	else if((mark>=90) && (mark<=100)){
	System.out.println("Your grade is S");
	}
	}

}