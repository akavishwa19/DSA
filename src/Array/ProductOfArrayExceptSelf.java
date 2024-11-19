package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static int[] productExceptSelf(int[] nums) {

        //get the length , avoid recalculation at each step
        int n=nums.length;

        //declare 2 arrays ,prefix and postfix
        int[] prefix=new int[n];
        int[] postfix=new int[n];

        //initialise values with 1 , of size n
        for(int i=0;i<n;i++){
            prefix[i]=1;
            postfix[i]=1;
        }

        //take a placeholder value to calculate prefix and postfix values
        int placeholder=1;

        //iterate left to right
        for(int i=0;i<n;i++){

            //currentindex is placeholder val
            prefix[i]=placeholder;

            //update placeholder based on orignal array
            placeholder*=nums[i];
        }

        //repeat for postfix but from reverse direction
        placeholder=1;

        for(int i=n-1;i>=0;i--){
            postfix[i]=placeholder;
            placeholder*=nums[i];
        }

        //override final array with solution

        for(int i=0;i<n;i++){
            //product of values at corresponding indices is the answer
            nums[i]=prefix[i]*postfix[i];
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans=productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
}
