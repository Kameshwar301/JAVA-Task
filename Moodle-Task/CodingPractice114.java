import java.util.Scanner;
class CodingPractice114{
	public static void main(String args[]){
	System.out.print("a is ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.print("b is ");
	int b = sc.nextInt();
	int c;
	c = a;
	a = b;
	b = c;
	System.out.println("a is "+a);
	System.out.println("b is "+b);

	}

}