import java.util.Scanner;

class CodingPractice126{
public static void main(String args[]){
int a[] = {5,7,2,4,9};
int min =0, max = 0;
for(int i=0; i<a.length; i++){

if(max<a[i]){
max=a[i];

}
for(int j=i+1; j<a.length; j++){
if(a[i]>a[j]){
	min =a[j];
	a[i] = a[j];
	a[j] = min;
}
}

}
System.out.println(max);
System.out.println(min);
System.out.println(max - min);
}
}