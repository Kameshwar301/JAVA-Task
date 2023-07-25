class CodingPractice129{
public static void main(String args[]){
int a = 1, b =2, d =1, e = 2, input=5, count = 10;
System.out.print(a+" "+b);
for(int i =1; i<=input-2; i++){
int c = a+b;
System.out.print(" "+c);
	a = b;
	b = c;
	

}
System.out.println();
System.out.print(d+" "+e);
for(int i =3; i<=count; i++){
int f = d+e;
System.out.print(" "+f);
	d = e;
	e = f;
	

}
}

}