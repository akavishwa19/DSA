package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    static List<String> summaryRanges(int[] nums) {
        //create an answer list
        List<String> ans = new ArrayList<>();

        //pointers to point the first index
        int i=0;

        //we will be moving i till it reaches the end
        while (i<nums.length){

            //create a start value which will hold the value of current range's start index
            int start=nums[i];

            //then we will iterate for that range
            //it should not be going out of bounds so w have a check for i being less than length-1
            //we also move i till the condition is satisfied that is the next value is one more than previous value
            while (i<nums.length-1 && nums[i]+1==nums[i+1]){

                //while that happens we can just move i forward
                i++;
            }

            //when the condition becomes false
            //we need to add in our list but we have two directions here as well
            //first that we actually got a range
            //in case we got a range , we add from start to ith value else just add the ith value
            if(start!=nums[i]){
                ans.add(start+"->"+nums[i]);
            }
            else{
                ans.add(String.valueOf(nums[i]));
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] nums={0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}
