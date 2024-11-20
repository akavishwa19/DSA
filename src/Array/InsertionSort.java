package Array;

import java.util.Arrays;

public class InsertionSort {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void insertion_sort(int[] arr){

        //store length to avoid recalculation
        int n=arr.length;

        //iterate n-1 times
        for(int i=0;i<n-1;i++){

            //we consider left side to be sorted , so start from the first index
            for(int j=i+1;j>0;j--){

                //check if j value is smaller than elements of the sorted array
                if(arr[j]<arr[j-1]){
                    //swap
                    swap(arr,j,j-1);

                }
                else{
                    //if the no. at current index is lesser than the value at index preceding the current index
                    //the left side is already sorted
                    //so we dont need to check again and again
                    //we can simply break the loop

                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,5,-11,0};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
