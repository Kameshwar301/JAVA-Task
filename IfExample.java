import java.util.Scanner;
class IfExample{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr your Age");
	int age = sc.nextInt();
	if(age>=18){
	System.out.println("Your Elegible");
	}
	else{
	System.out.println("You are not eleigeble");
	}
	}
}