package Array;

import java.util.Arrays;

public class SortColors {

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static void sort_colors(int[] nums){

        //precalculate length
        int n=nums.length;

        //have a counter for all the different types of balls
        int i_count=0;
        int j_count=0;
        int k_count=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                i_count++;
            }
            else if(nums[i]==1){
                j_count++;
            }
            else{
                k_count++;
            }
        }

        //iterate over the original array and overwrite the values base on count
        for(int i=0;i<n;i++){

            //if i is less than count of i , fill 0s
            //if i is less than count of sum of i and j , fill 1s
            //else fill 2s
            if(i<i_count){
                nums[i]=0;
            }
            else if(i < i_count+j_count){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }

    static void sort_colors_optimal(int[] nums){
        //we will arrange all the 0s in the beginning and all the 2s at the end
        //hence all the 1s will be in place
        //so basically we just need to arrange only 0s and 1s , so we need 2 pointers ,i for 0s and k for 2s

        int i=0;
        int k=nums.length-1;
        int j=0;

        while (i<k){
            //if I encounter a zero value , swap with j value and increment both
            if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            } //if a 2 is found , swap with kth index and decrement k , as well as increment j
            else if(nums[i]==2){
                swap(nums,i,k);
                k--;
                i++;
            } //if none of this happens , just increment j
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,1};
        sort_colors_optimal(arr);
        System.out.println(Arrays.toString(arr));
    }

}
