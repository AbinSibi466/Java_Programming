class Method2{
void display(int a,int b){
System.out.println("Numbers are:"+a+" and "+b);
}
}

class Method1 extends Method2{
void display(int c,int d){
System.out.println("Numbers are:"+c+" and "+d);
}
}

class MainM{
public static void main(String args[]){
Method1 mc= new Method1();
Method2 mc2 = new Method2();
mc.display(10,20);
mc2.display(20,30);
}
}