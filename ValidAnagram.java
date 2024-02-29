import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstStr = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondStr = scanner.nextLine();

        // Check if the strings are anagrams
        boolean result = isAnagram(firstStr, secondStr);

        // Print the result of condition
        System.out.println("Are the strings anagrams? " + result);
    }

    public static boolean isAnagram(String firstStr, String secondStr ) {

        firstStr = firstStr.replaceAll("\\s", "").toLowerCase();
        secondStr = secondStr.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they cannot be anagrams othwise is correct
        if (firstStr.length() != secondStr.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] firstChars = firstStr.toCharArray();
        char[] secondChars = secondStr.toCharArray();
        Arrays.sort(firstChars);//sort charecters
        Arrays.sort(secondChars);

        // Compare sorted arrays
        return Arrays.equals(firstChars, secondChars);
    }
}
