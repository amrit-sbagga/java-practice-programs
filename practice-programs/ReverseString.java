/**
 * Requirement:
 * Reverse a given string without using built-in reverse().
 */
public class ReverseString {

    private static String reverseString(String str)  {
        if(str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
       String str = "Hello Amrit";

       String reverse = reverseString(str);
       System.out.println("Reversed string using loop: " + reverse);


       // using StringBuilder
       StringBuilder sb = new StringBuilder(str);
       sb.reverse();
       System.out.println("Reversed string: " + sb.toString());

    }
}
