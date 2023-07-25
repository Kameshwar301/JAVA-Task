import java.util.Scanner;
class CodingPractice112{
	public static void main(String args[]){
	System.out.print("a =");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.print("b =");
	int b = sc.nextInt();
	System.out.print("c =");
	int c = sc.nextInt();
	int sum = a + b + c;
	int avg = sum/3;
	System.out.println("Average of the numbers: "avg);
	
	}
}