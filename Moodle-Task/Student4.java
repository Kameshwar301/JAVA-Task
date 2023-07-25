class Student4{
//parameterized constructor

int id;
String name;

Student4(int i, String n){
id = i;
name = n;

}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
Student4 st1 = new Student4(101, "Kameshwar");
Student4 st2 = new Student4(102, "Ashok");
st1.display();
st2.display();

System.out.println(6 - 2 + 10 % 4 + 7);

}

}