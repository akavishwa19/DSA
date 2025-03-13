package Algorithms;

import java.util.Arrays;

public class InsertionSort {

    static  void swap(int[] arr,int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void insertion(int[] arr){

        int size=arr.length;

        //outer loop for iterations
        for(int i=0;i<size-1;i++){

            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }

        }

    }

    static void actualInsertion(int[] arr){

        int size=arr.length;

        //outer loop for the phases
        for(int i=1;i<size;i++){

            //call the current j index to be the key
            int key=arr[i];

            //the value to start comparison with is one behind our start value
            int j=i-1;

            //so first thing to keep in mind is that we will make comparisons until and unless we have values that are greater than our key value
            //basically we are shifting elements to the right and finding the position of key and placing it at that position
            //so worst case scenario is that we will traverse till the oth index , thats why we check till j greater than zero
            //also we need to compare till there is no value greater than key

            while(j>=0 && arr[j]>key  ){
                arr[j+1]=arr[j];
                j--;
            }

            //at the end put the key to its position and that is exactly where our j+1 points now
            arr[j+1]=key;

        }
    }

    public static void main(String[] args) {

        //in this algorithm , we take the small part of array and sort it , and then grow it one by one
        //the outer loop is for the phases
        //inner loop for the sorting mechanism and the inner loop runs in reverse that means j starts from wnd to 0 and swaps the values
        //it is right but the way we implement the algo also matters

        //actual approach is that we need to select the subarray and we are growing it one by one and sorting it with each phase / iteration
        //while we are in the subarray we have to place the elemtn at the correct position and shift the rest of the elements



        int[] arr={4,1,3,2,5};
        actualInsertion(arr);

        System.out.println(Arrays.toString(arr));
    }

}
