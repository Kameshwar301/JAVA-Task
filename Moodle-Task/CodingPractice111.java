import java.util.Scanner;
class CodingPractice111{
	public static void main(String args[]){
	System.out.println("Radius =");
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	double p = (2 * 3.14 * radius);
	double q = (3.14 * radius * radius);
	System.out.println("Perimeter is ="+p);
	System.out.println("Area is ="+q);
	}
}