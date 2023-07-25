import java.util.Scanner;
class CodingPractice118{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("number is:");
	int number = sc.nextInt();
	System.out.println("Divided by 3:");
	for(int i =1; i<=number; i++){
	if(i%3 ==0){
	System.out.print(i+", ");
	
	}
	}
	System.out.println();
	System.out.println("Divided by 5:");
	for(int j = 1; j<=number;j++){
		if(j%5 ==0){
	System.out.print(j+", ");
	
	}
	}
	System.out.println();
	System.out.println("Divided by 3 & 5:");
	for(int k = 1; k<=number; k++){
	if((k%3==0)&&(k%5==0)){
	System.out.print(k+", ");	
	}
	}


}
}


