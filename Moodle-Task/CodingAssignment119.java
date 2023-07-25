import java.util.Scanner;

class CodingPractice119{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input first integer: ");
	int a = sc.nextInt();
	System.out.print("Input second integer: ");
	int b = sc.nextInt();
	int c = a + b;
	int d = a - b;
	int e = a * b;
	double f = (double)(c/2);
	int g = a - b;
	System.out.println("Sum of two integers: "+c);
	System.out.println("Difference of two integers: "+d);
	System.out.println("Product of two integers: "+e);
	System.out.println("Average of two integers: "+f);
	System.out.println("Distance of two integers: "+g);
	System.out.println("Max integer: "+Math.max(a,b));
	System.out.println("Min integer: "+Math.min(a,b));
	

}


}