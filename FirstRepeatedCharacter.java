import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  your input string :");

        String userInput=scanner.nextLine();
        Character result = findFirstRepeatedCharacter(userInput);
        if (result != null) {
            System.out.println("charcter that repeated : '" + result + "'");
        } else {
            System.out.println("Output: No repeating characters");
        }

    }
    public  static  Character findFirstRepeatedCharacter(String str){
        Set<Character> characterSet=new HashSet<>();// create  set to store characters that seen beefor on the set
        for (char ch : str.toCharArray()) {
            // check If the character is already in the set, it's the first repeated character
            if (characterSet.contains(ch)) {
                return ch;
            }
            characterSet.add(ch);
        }
        return null;
    }
}
