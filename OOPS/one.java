// Class wthout constructor
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("This is write function.");
    }
    public void out(){
        System.out.println("This is output function.");
        System.out.println( "Color : "+ this.color);
        System.out.println("Type : " + this.type);
    }
}

// Class with constructor
class Student{
    String name;
    int age;
    
    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Constructor print with parameter
    Student(){

    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class one {
    public static void main(String[] args) {
        // Automatic construction made
        pen p1 = new pen();
        p1.color = "red";
        p1.type = "Bolpen";
        p1.write();
        p1.out();

        // Construction call with parameter
        Student s1 = new Student();
        s1.name = "Sushant";
        s1.age = 20;
        Student s2 = new Student(s1);// copy constructor
        s2.PrintInfo();
    }
}
