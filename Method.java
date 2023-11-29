public class Method{
void display(int a,int b){
System.out.println("Numbers are:"+a+" and "+b);
}
void display(int c,int d,int e){
System.out.println("Numbers are:"+c+","+d+" and "+e);
}
public static void main(String args[]){
Method mc= new Method();
mc.display(10,20);
mc.display(20,30,40);
}
}