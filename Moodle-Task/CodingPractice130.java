class CodingPractice130{
public static void main(String args[]){
String name = "madam";
String reverse="";
int length = name.length();
for(int i=length-1;i >= 0;  i--){
reverse = reverse + name.charAt(i);
	if (name.equals(reverse)){
	System.out.println(name+" is palindrome");


}

}


}


}