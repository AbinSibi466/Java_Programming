import java.util.Scanner;

public class GenericInterfaceExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer");
        int intValue = scanner.nextInt();
        System.out.println("Enter the double");
        double doubleValue = scanner.nextDouble();
        System.out.println("Enter the String");
        String stringValue = scanner.next();
        MyInterface<object>myInterface = new MyInterface<object>
(){
    publlic Object performOperation(Object value){
        @Override
        if(value instanceof Integer){
            return (int value* 2;
            )
        }else if(value instanceof Double){
            return (doubleValue)/2;
        }else if(value instanceof String){
            return((String)value).toUpperCase()
        }else{
            return null;  
        }
    }
}    };
Object result1 = myInterface.performOperation(intValue);
Object result2 = myInterface.performOperation(doubleValue);
Object result3 = myInterface.performOperation(stringValue);
System.out.println("Result 1"+result1);
System.out.println("Result 1"+result2);
System.out.println("Result 1"+result3);



    
}
annmary is a good annmary loves abin
abin is not a good boy

