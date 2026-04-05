public class SetBit {
    public static void main(String[] args) {
        // set the new number on the position of 5
        int n = 5;// 0101 -> binary -> 0111 => 7
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;

        System.out.println("Final number is : " + newNumber);
    }
}
