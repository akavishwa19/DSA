package Recursion;

public class SortedArray {

    static boolean sorted(int[] arr,int index){

        //we are passing the whole array in the call in order to traverse it through out the calls
        //index has to be passed , as we will move the index to check the elements


        //if the index reaches length , that means all the elements are sorted
        if(index==arr.length-1){
            return true;
        }

        //if the current element is greater than the next one , that means array is not growing , so just return false in that case
        if(arr[index]>arr[index+1]){
            return false;
        }

        //if all conditions are satisfied , move the index by one and continue checking
        return sorted(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,4,5};
        System.out.println(sorted(arr,0));
    }

}
