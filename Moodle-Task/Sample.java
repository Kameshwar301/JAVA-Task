 class Sample{
static int count = 0;
	int c = 10;
Sample()
{
count++;
System.out.println(count);

}
void sum(){
int x = 5, y = 5;
System.out.println("add value is: "+(x+y));
}
static void display(){
System.out.println("Hi Sudha" +count);
}

static{
System.out.println("Value is: ");
count = count+100;
System.out.println(count);
}
public static void main(String args[]){
Sample a = new Sample();
a.sum();
display();
Sample b = new Sample();
Sample c = new Sample();
System.out.println(args[0]);
}
}