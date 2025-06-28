package General;

public class PalindromeString {

    static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        //iterate till any of the pointers overlap or we get a owrd that is not same
        while (i < j) {
            // Skip non-alphabetic characters from left
            while (i < j && !Character.isLetter(s.charAt(i))) {
                i++;
            }

            // Skip non-alphabetic characters from right
            while (i < j && !Character.isLetter(s.charAt(j))) {
                j--;
            }

            // Compare characters
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

}
