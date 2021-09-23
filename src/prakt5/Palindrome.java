package prakt5;

public class Palindrome {
    public static boolean palindrome(String s){
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;
        if (size <= 1) {
            return true;
        } else {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            return firstChar == lastChar && palindrome(subString);
        }
    }
    public static void main(String[] args) {
        if (palindrome("radar")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
