package Array;

public class MaximumConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] nums){

        //keep a variable for storing the value of consecutive ones ans update it to zero when a 0 is encountered
        //keep another variable to store the streak of maximum consecutive ones , update it when a number greater than the current count is found

        int currentCount=0;
        int streak=0;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==1){
                currentCount++;
                streak=Math.max(streak,currentCount);
            }
            else {
                currentCount=0;
            }
        }

        return streak;

        
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
