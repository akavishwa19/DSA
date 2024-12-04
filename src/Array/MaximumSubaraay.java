package Array;

public class MaximumSubaraay {

    static int maxSubArray(int[] nums) {

        //starting off this algorithm is sick
        //the intuition for this is
        //i will have a currentsum value which will hold the sum for the subarray
        //the moment the sum of the subarray goes beyond zero , we will make the current sum 0 , reason is simple , if the value is negative , whatever may be the next calue
        //we will be subtracting something form that value right
        //and that could potentially be our bigger sub array
        //what is the point of sum?
        //it just holds the value that the current sum may produce when it becomes greater than any of the produced currentsum values

        int sum=Integer.MIN_VALUE;
        int currentsum=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            currentsum+=nums[i];


            if(currentsum>sum){
                sum=currentsum;
            }

            if(currentsum<0){
                currentsum=0;
            }

        }

        return sum;
    }
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));



    }
}
