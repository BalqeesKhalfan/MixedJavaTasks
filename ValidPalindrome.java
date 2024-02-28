import java.util.Scanner;

public class ValidPalindrome {
    public static  void  main(String[] args){
        Scanner str=new Scanner(System.in);
        System.out.println("Enter String with same left  and right :");
        String userInput=str.nextLine();
        boolean  isPalindrom=isPalindrom(userInput);
        //check if the  user input palidrom or not
      if(isPalindrom){
            System.out.println(" is a palinrome String");
        }
        else {
          System.out.println("is not a palinrome String");
      }
    }


    public static boolean isPalindrom(String str){
        //convert to lower case  and remove non strings
           str=str.toLowerCase();
           String noSpace=str.replaceAll("['  ,]","");// remove sepical characters
           System.out.println(noSpace.replace(" ",""));// remove spaces
        int left=0; int right=str.length()-1;
        while (left < right){
            char rightChar=str.charAt(right);
            char leftChar=str.charAt(left);
            if(!Character.isAlphabetic(rightChar)){

                right--;
                continue;
            }
            if(!Character.isAlphabetic(leftChar)){

                left++;
                continue;

            }
            if(leftChar !=rightChar){

                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
