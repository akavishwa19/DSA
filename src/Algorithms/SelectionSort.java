package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int largest(int[] arr,int start,int end){
        int greatest=start;
        for(int j=start;j<=end;j++){
            if(arr[j]>arr[greatest]){
                greatest=j;
            }
        }

        return greatest;
    }

    static void selection(int[] arr){
        int size=arr.length;

        //number of iterations
        for(int i=0;i<size;i++){
            //swapping index
            int swappingIndex=size-1-i;

            int largestIndex=largest(arr,0,swappingIndex);
            swap(arr,swappingIndex,largestIndex);

        }

    }

    public static void main(String[] args) {

        //the algorithm is such that we have tp grab the largest element from the list and then place it to ots right position
        //what we can do is grab the largest value and place it to the end
        //the other way is also possible , place the smallest value to the start of the array
        //by placing we are actually swapping the values

        int[] arr={4,1,3,2,5};
        selection(arr);

        System.out.println(Arrays.toString(arr));

    }
}
