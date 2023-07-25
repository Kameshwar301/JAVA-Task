class EmployeeSalary{
int eid;
String ename;
long phoneno;
static String mgr;

EmployeeSalary(int eid, String ename, long phoneno, String mgr){
	this.eid = eid;
	this.ename = ename;
	this.phoneno = phoneno;
	this.mgr = mgr;
}
void display(){
System.out.println("id: " +eid+ " " +"ename: " +ename+" " +"Phoneno: " +phoneno +" "+"Mgr:" +mgr);

}
public static void main(String args[]){
	EmployeeSalary Sudha = new EmployeeSalary(101, "Sudha", 1234567890, "Bhanu");
EmployeeSalary SCB = new EmployeeSalary(102, "SCB", 1234567892, "Bhanu");
EmployeeSalary Shok = new EmployeeSalary(103, "Shok", 1234567895, "Bhanu");
Sudha.display();
SCB.display();
Shok.display();

System.out.println(Sudha);
System.out.println(SCB);
System.out.println(Shok);
}
}