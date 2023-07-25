import java.util.Scanner;

class CodingPractice124{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a[] = {1,2,5,5,6,6,7,2};
for(int i =0; i<a.length;i++){
for(int j = i+ 1; j<a.length; j++){
if(a[i] == a[j]){
System.out.print(a[j+" "]);
}
}
}

}
}