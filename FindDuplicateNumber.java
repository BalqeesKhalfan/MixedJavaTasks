import java.util.*;

public class FindDuplicateNumber {
    public  static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        //Ask user to enter length of Array
        System.out.println("Enter Number of Elements on your Integer Array :");
        Integer n =scanner.nextInt();
        List<Integer> nunbers=new ArrayList<>();
       // Integer[] nunbers=new Integer[n];// declear the aaray
        // Enter the array element
        System.out.println("Enter Array Elements :");
        for (int i=0;i<n;i++){
            nunbers.add(scanner.nextInt());
        }
        //stor the element of array on set to find the duplicat number
        Set<Integer> duplicatNum=new HashSet<>();
        System.out.println("Duplicate Number :");
        for(Integer num : nunbers){
            if(!duplicatNum.add(num)){
                System.out.print(num+" ");
            }
        }




    }
}
