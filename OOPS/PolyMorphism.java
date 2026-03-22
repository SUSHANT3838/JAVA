// student class
class Student_info {
    String name;
    int age;
    // polymorphism concept
    // only name
    public void info(String name) {
        System.out.println(name);
    }
    // only age
    public void info(int age){
        System.out.println(age);   
    }
    // name and age
    public void info(String name, int age){
        System.out.println(name + " " + age);
    }
    
}
// main class
public class PolyMorphism {
    public static void main(String[] args) {
        // create an object using class
        Student_info s = new Student_info();
        s.name = "Sushant";// assign the name value
        s.age = 20;// assign the age value

        s.info(s.name);// call name
        s.info(s.age);// call age
        s.info(s.name, s.age);// call name and age
    }
}
