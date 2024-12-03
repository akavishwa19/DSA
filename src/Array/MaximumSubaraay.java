package Array;

public class MaximumSubaraay {

    static int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            if(currentSum+nums[i+1]>nums[i+1]){
                System.out.println(currentSum);
                currentSum+=nums[i+1];
            }
        }

        return currentSum;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
