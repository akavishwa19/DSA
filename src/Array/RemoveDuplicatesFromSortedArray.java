package Array;

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] nums){

        //so we will have two pointers ofr this approach
        //one pointer will be pointing to the first element , the second pointer will be pointing to the first element
        //move j forwards , and i conditionally
        //check for the elements at i and j , if they are same , simply move j forward , but if they are not same , move i one place forward , and copy the value j th element to ith element value and continue the process

        int i=0;

        for (int j = 1; j < nums.length ; j++) {

            //if the element is distinct , move i and copy
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        //return the number of elements that have been swapped , increment the value by one and return
        return i+1;

    }
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
}
