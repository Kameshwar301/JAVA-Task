//two dimensional 
import java.util.Scanner;
class ArrayEx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a [] [] = new int [3] [2];
		int b [] [] = new int [3] [2];
		int c [] [] = new int [3] [2];
	System.out.println("2d Array value:");
	for(int i = 0; i<3; i++){
	for(int j = 0; j<2; j++){
	a[i][j] = sc.nextInt();
	}
	}
	for(int i = 0; i<3; i++){
	for(int j = 0; j<2; j++){
	b[i][j] = sc.nextInt();
	}
	}
	for(int i = 0; i<3; i++){
	for(int j = 0; j<2; j++){
	c[i][j] = 0;
	for (int k = 0; k<2; k++){
	c[i][j] += a[i][k] * b [k][j];
	}
	}
	}
	for(int i = 0; i<3; i++){
	for(int j = 0; j<2; j++){
	System.out.print(c[i][j]);
	}
	}
		
}



}