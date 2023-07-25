import java.util.Scanner;

class CodingPractice115{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i = 0; i<=a; i++){
	System.out.println();
	for(int j = a-i;j >1; j--){
	System.out.print(" ");
	}
	for(int j = 0; j<=i; j++)
	System.out.print("* ");	
	}
	
	}

}