class Student_info {
    String name;
    int age;

    public void info(String name) {
        System.out.println(name);
    }
    
    public void info(int age){
        System.out.println(age);   
    }

    public void info(String name, int age){
        System.out.println(name + " " + age);
    }
    
}

public class PolyMorphism {
    public static void main(String[] args) {
        Student_info s = new Student_info();
        s.name = "Sushant";
        s.age = 20;

        s.info(s.name);
        s.info(s.age);
        s.info(s.name, s.age);
    }
}
