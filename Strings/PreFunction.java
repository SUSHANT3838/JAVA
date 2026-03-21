import java.util.*;
public class PreFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        // print as it it
        System.out.println("Name Entered -> " + name);
        // print in uppercase
        System.out.println("Name in UpperCase -> " + name.toUpperCase());
        // print in lowercase
        System.out.println("Name in LowwerCase -> "+ name.toLowerCase());
        // print length 
        System.out.println("Length of name -> " + name.length());
        // access all ele through index
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        // compare two string
        String name1 = "Shete";
        System.out.println(name.compareTo(name1));
    }
}
