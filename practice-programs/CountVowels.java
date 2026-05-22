/**
 * Requirement:
 * Count vowels (a,e,i,o,u) in a string — case insensitive.
 */
public class CountVowels {

    private static int countVowels(String str) {
        if(str == null || str.isEmpty()){
          return 0;
        }

        String vowels = "aeiou";
        int count = 0;

        for(char ch : str.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if(vowels.indexOf(lower) >= 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Hello Amrit";
        int count = countVowels(str);
        System.out.println("Count of vowels: " + count);
    }
}
