package Algorithms;

public class BinarySearch {


    static int search(int[] arr,int target){

        int size=arr.length;

        int start=0;
        int end=size-1;


        while (start<=end ){

            int mid=start+ (end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        //algorithm to search for a specific target in a sorted array
        //idea is to search ofr the element in halves , basically search for those where the element may lie

        int[] arr={1,2,4,6,10,33};
        System.out.println(search(arr,34));

    }

}
