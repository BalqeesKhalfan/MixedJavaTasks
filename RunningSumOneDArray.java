import java.util.ArrayList;

import java.util.Scanner;

public class RunningSumOneDArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  total number of elements in array : ");
        Integer length=scanner.nextInt();
        ArrayList<Integer> coninsArray=new ArrayList<>();

        System.out.println("Enter Elements of Array :");
        for (int i=0;i<length;i++){
            coninsArray.add(scanner.nextInt());
        }

        System.out.println("Input values Element's array  : " + coninsArray);
       System.out.println("Output values after runnig sum : " + runningSum(coninsArray));

    }
    public static ArrayList<Integer> runningSum(ArrayList<Integer>nums){
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);//adding the value retrieved from sum
            nums.set(i, sum);// update or replace  the value of orginal array based on the result getting from sum method
        }
        return nums;
    }
}
