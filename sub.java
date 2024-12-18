public class sub {
    public static void printSubsequences(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }
        printSubsequences(input.substring(1), output);
        printSubsequences(input.substring(1), output + input.charAt(0));
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "");
    }
}


