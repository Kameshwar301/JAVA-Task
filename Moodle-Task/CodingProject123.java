import java.util.Scanner;

class CodingProject123{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
	for(int i =0; i<a.length; i++){
	System.out.print("Original Array: "+a[i]+" ");
	}
	System.out.println(" ");
	for(int j = a.length- 1;j>-1; j--){
	System.out.print("Reverse Array: "+ a[j]+" ");
}

}

}