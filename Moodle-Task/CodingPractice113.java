import java.util.Scanner;
class CodingPractice113{
	public static void main(String args[]){
	System.out.print("Number ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	for(int i = 2; i<=number; i++){
	int count = 0;
	for(int j = 2; j<i; j++){
		if(i%j == 0){
			count++;
		}
	}
		if(count==0){
			System.out.print(i +" ");
		}
	}
		
	
	}
}