package Recursion;

public class LinearSearch {

    static int search(int[] arr,int index,int target){

        //if we cross the index value outside of the length , the element is not present
        if(index>arr.length-1){
            return -1;
        }

        //if the element matched the target , return the index
        if(target==arr[index]){
            return index;
        }

        //move the index ahead to search for that particular index of the array
        return search(arr,index+1,target);

    }
    public static void main(String[] args) {
        int[] arr={1,2,7,4,5};
        System.out.println(search(arr,0,7));
    }
}
