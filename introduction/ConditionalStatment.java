import java.util.*;
public class ConditionalStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check for adult
        // System.out.print("Enter your age : ");
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        // check even or odd
        int a;
        a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
