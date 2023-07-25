import java.util.Scanner;
class DeciToBin{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ender range of Decimal:");
	int deci = sc.nextInt();
	for(int i = 0; i<=deci; i++){
	System.out.println(i+" "+Integer.toBinaryString(i));	
	}


}



}