import java.util.Arrays;

/**
 * Requirement:
 * Check if two strings are anagrams (same characters, different order).
 */
public class AnagramCheck {

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }

    public static void main(String[] args) {
        // Your code here

        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = isAnagram(str1, str2);
        System.out.println("isAnagram: " + isAnagram);
    }
}
