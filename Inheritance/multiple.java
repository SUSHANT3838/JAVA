interface A{
    void SY_A ();
}
interface B{
    void SY_B ();
}
class S implements A ,B {
    public void SY_A() {
        System.out.println("CSE A div.");
    }
    public void SY_B () {
        System.out.println("CSE B div.");
    } 
}

public class multiple {
    public static void main(String[] args) {
        S s1 = new S();
        s1.SY_A();
        s1.SY_B();
    }
}
