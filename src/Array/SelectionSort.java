package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    //return the index of the largest element in the array
    static int index_of_largest(int[] arr,int start,int end){

        //initialise largest carrying value index as start
        int index=start;

        //iterate till end index (inclusive)
        for(int i=start;i<=end;i++){

            //if a value is found where value is greater than current , assign index with that index value
            if(arr[i]>arr[index]){
               index=i;
            }
        }
        return index;
    }

    //swap any 2 given values of an array with gievn array and indices to swap
    static  void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    //select the largest element in the array and place it at its right index
    //then select the largest in the remaining array and place it in the last place of the remaining array
    //repeat the process till only the last element is left to place
    static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){

            //find the last index , it
            int last_index=arr.length-1-i;
            int largest_value_index=index_of_largest(arr,0,last_index);
            swap(arr,last_index,largest_value_index );
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
