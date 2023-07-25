import java.util.Scanner;

class CodingPractice121{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] = {35,5,55,15,99};
	int min = 0;
	System.out.println("Enter Single Dimensional array");
	for (int i = 0; i<a.length; i++){
	
	 
	for(int j = i + 1; j<a.length;j++){
	if(a[i]>a[j]){
	min =a[i];
	a[i] = a[j];	
	a[j] = min;
	}
	}
	
	System.out.println(a[i]+" ");
	}
}
}