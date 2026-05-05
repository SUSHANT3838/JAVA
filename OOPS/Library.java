
class Book {
    String Title;
    String Author;
    int Pages;

    // display Book information
    void displayBookInfo(){
        System.out.println("Title : " + Title);
        System.out.println("Author : " + Author);
        System.out.println("Num of Pages : " + Pages);
    }
}
class Student{
    String name;
    int age;
    char grade;

    // display student information
    void displayStudentInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class Library {
    public static void main(String[] args) {
        // Book
        Book myBook = new Book();
        myBook.Title = "Java";
        myBook.Author = "XYZ";
        myBook.Pages = 300;
        myBook.displayBookInfo(); // call Book Display
        System.out.println();
        // Student
        Student student1 = new Student();
        student1.name = "XYZ";
        student1.age = 15;
        student1.grade = 'A';
        student1.displayStudentInfo(); // call Student Display
    }
}
