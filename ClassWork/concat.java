package ClassWork;
class Simmutable{
public static void main(String args[]){
String a = "Abin";
a.concat("Sibi");
System.out.println("The value in the variable is:"+a);
a=a.concat("Sibi");
System.out.println("The value in the variable is:"+a);
}
}