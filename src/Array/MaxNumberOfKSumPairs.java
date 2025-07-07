package Array;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    static int maxOperations(int[] nums,int k){
        //logic is pretty straightforward , first we will be sorting the array so that will make the array ascending in nature
        //then we will put 2 pointers ,one at the start of the array and another one at the end of the array
        //we wil keep calculating the sum for each iteration and compare the sum with k value
        //if it is greater than k , that means we need to move our j pointer towards start
        //if it is smaller than k , that means we need to move i pointer towards end
        //if sum is equal to k , move i forward and j backwards

        //sort the array
        Arrays.sort(nums);

        //pointers
        int i=0,j=nums.length-1;

        //calculate steps
        int steps=0;

        //move till i is lesser than j
        while(i<j){

            //if sum is equal k , increment i and decrement j and increase the number of steps
            if(nums[i]+nums[j]==k){
                steps++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }

        return steps;

    }
    public static void main(String[] args) {
        int[] nums={3,1,3,4,3};
        System.out.println(maxOperations(nums,6));
    }
}
