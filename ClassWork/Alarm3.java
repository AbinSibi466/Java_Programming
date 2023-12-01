package ClassWork;
import java.util.*;
class Alarm3
{
String message;
boolean active;
ArrayList<Sting> regphone;

Alarm3()
{
this.message="";
this.active=false;
regphone=new ArrayList<String>();
}

void register(String phoneno)
{
regPhone.add(phoneno);
System.out.println("Your Phone number is registered:",+phoneno);
}

void visualise()
{
if(active)
{
System.out.println("Alarm is active");
}
else
{
{
System.out.println("Alarm is inactive");
}
}
void activateAlarm()
{
this.active=true;
visualise();
}

}