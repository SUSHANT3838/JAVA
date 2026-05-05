public class StringBuilders {
    public static void main(String[] args) {
        // Declare String Builder
        StringBuilder sb = new StringBuilder();

        // Add value & print
        sb.append("Ocyge");
        System.out.println(sb);

        // Rplace any character
        sb.setCharAt(1,'x');
        // insert character
        sb.insert(5,'n');

        // print new word
        System.out.println(sb);

        // Delete sub-String
        sb.delete(3, sb.length());
        System.out.println(sb);

    }
}
