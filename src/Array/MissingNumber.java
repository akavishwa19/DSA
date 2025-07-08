package Array;

public class MissingNumber {

    static int missingNumber(int[] nums){
        //first get the sum to n numbers and then find the sum to the numbers in the array
        //since we know that the missing number is replaced by zero in the array , just subtract the sum to n numbers from that of the sum of array elements
        //we will get the answer

        int n=nums.length;

        //sum to n numbers
        int sum=(n*(n+1))/2;

        //array sum
        int arraySum=0;
        for (int i = 0; i < n; i++) {
            arraySum+=nums[i];
        }

        return sum-arraySum;

    }
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
