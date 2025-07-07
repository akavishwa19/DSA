package Array;

import java.util.Arrays;

public class MoveZeros {

    static void swap(int[] nums,int i , int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    static void moveZeros(int[] nums){
        //take two pinters for i and j , initially pointing to zeroth place
        int i=0,j=0;

        //loop until j reaches the end
        while (j<nums.length){

            //if the element at jth index is not zero , swap it with the elemnt at ith index , and move i and j forward
            //otherwise just move forward
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
