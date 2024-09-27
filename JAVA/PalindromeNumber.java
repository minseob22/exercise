package JAVA;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int origin = x;
        int revered =0;

        if (x < 0) {
            return false;
        }

        while (x>0) {
            int lastdigit = x % 10;
            x = x / 10;
            revered = revered*10 + lastdigit;
        }

        return origin == revered;
    }

    public static void main(String[] args) {

        PalindromeNumber test = new PalindromeNumber();

        int x1 =121;
        System.out.println(test.isPalindrome(x1));

        int x2 = -121;
        System.out.println(test.isPalindrome(x2));

        int x3 = 10;
        System.out.println(test.isPalindrome(x3));
    }
}
