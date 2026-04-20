public class Palindrome {
    public static Boolean isValidPalindrome(String cad) {
        StringBuilder validString = new StringBuilder(cad);
        validString = validString.reverse();
        if (validString.toString().equals(cad)) {
            return true;
        }
        return false;
    }
}
