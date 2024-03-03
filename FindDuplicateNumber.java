import java.util.*;

public class FindDuplicateNumber {
    public  static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        //Ask user to enter length of Array
        System.out.println("Enter Number of Elements on your Integer Array :");
        Integer n =scanner.nextInt();
        List<Integer> numbers=new ArrayList<>();

        System.out.println("Enter Array Elements :");
        for (int i=0;i<n;i++){
            numbers.add(scanner.nextInt());
        }
        //stor the element of array on set to find the duplicat number
        Set<Integer> duplicateNum=new HashSet<>();
        System.out.println("Duplicate Number :");
        for(Integer num : numbers){
            if(!duplicateNum.add(num)){
                System.out.print(num+" ");
            }
        }
        if (duplicateNum.size() == numbers.size()) {
            System.out.println("No duplicate numbers found.");
        }


      scanner.close();

    }
}
