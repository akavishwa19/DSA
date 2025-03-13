package Recursion;

public class BinarySearch {

    //make sure to return the result of the function call , if it has a return type because remember that the function returns this value to where it was called from
    //basically the previous function call

    static int search(int[] arr,int start,int end,int target){

        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(target>arr[mid]){
          return search(arr,mid+1,end,target);
        }

        return search(arr,start,mid-1,target);

     

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        System.out.println(search(arr,0,arr.length-1,8));
    }
}
