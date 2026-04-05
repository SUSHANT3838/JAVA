public class ClearBit {
    public static void main(String[] args) {
        int n = 5; // 0101  -> 0001
        int pos = 2;
        int bitMask = 1<<pos;
        int notBit = ~(bitMask);

        int newNumber = notBit & n;

        System.out.println("After clear the bit the new number is : " + newNumber); // 0001
    }
}
