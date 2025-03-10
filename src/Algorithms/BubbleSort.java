package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    static  void swap(int[] arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void bubble(int[] arr){
        int size= arr.length;

        //outer loop to execute the inner part for that many times
        //inner loop for checking the conditions

        for(int i=0;i<size;i++){

            //we have a swapped boolean just in case the iteration occurs without any swap we can just come out pf the loop
            boolean swapped=false;
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                return;
            }
        }


    }

    public static void main(String[] args) {
        //check adjacent elements and swap if the adjacent element is greater
        //after the end of each iteration , the largest would be at the end
        //bubble sort because if we notice ,  the bubble enlarges from the right end of the array
        //also called sinking sort because if we notice the size of te array o be sorted reduces after each iteration
        //also called exchange sort because we are swapping/exchanging the values

        int[] arr={4,1,3,2,5};
        bubble(arr);

        System.out.println(Arrays.toString(arr));



    }
}
