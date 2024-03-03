import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArray {
    public  static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Length number of  your array  :");
        Integer n =scanner.nextInt();
        Integer[] numbers=new Integer[n];
        //input Array elements
        System.out.println("Enter Array Elements :");
        for (int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        //print all Array elements
        System.out.println("Array Elements  : "+ Arrays.toString(numbers));
        int result = numbers[0];//intlize the value of result of maximum sub array to value of first index of array
        int[] sum =  new int[numbers.length];
        sum[0] = numbers[0];
        // itrate all array elements and find the
        for(int i=1; i<n; i++){
            sum[i] = Math.max(numbers[i], sum[i-1] + numbers[i]);
            result = Math.max(result, sum[i]);
        }

        System.out.println("Maximum SubArray is : "+ result);

        scanner.close();
    }

}
