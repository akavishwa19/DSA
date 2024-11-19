package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    //check the adjacent elements and swap based on size and place the largest/smallest element at end after each traversal
    //iterate again , but this time exclude the last index as it is in place already
    //repeat till the last check
    //if there were no swaps , the array is already sorted , come out of the loop
    static void bubble_sort(int[] arr){

        //repeat for n-1 times
        for(int i=0;i<arr.length;i++){

            //a boolean to check if the array is already sorted
            boolean isSwapped = false;
            //put the last value at the end
            for(int j=1;j<arr.length-i;j++){
                //check if the current element is smaller than the previous one, goal is to shift the largest at the end
                if(arr[j]<arr[j-1]){
                    //swap with previous
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    //since swapping occured , set swap booolean to true
                    isSwapped=true;
                }
            }

            //if there were no swaps, then the array is already sorted
            if(!isSwapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
