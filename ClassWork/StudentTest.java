public class StudentTest {
    
}
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentTest1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ann");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
