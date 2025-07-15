package Array;

public class FindPivotIndex {

    static int pivotIndexIncorrect(int[] nums) {
        //pointers to the left and right
        int i=0;
        int j=nums.length-1;

        //left sum and right sum variables
        int leftSum=0;
        int rightSum=0;

        //move till i overlaps j
        while(i<j){

            //if left sum is less than right sum , move i and add to left sum
            if(leftSum < rightSum){
                leftSum += nums[i];
                i++;
            } else if (leftSum > rightSum) {
                rightSum += nums[j];
                j--;
            }else{
                if(j==i+1){
                    return i+1;
                }
                else {
                    i++;
                    j--;
                }
            }
        }

        return -1;
    }

    static int pivotIndex(int[] arr) {
        //first calculate total sum
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum=0;
        int rightSum=0;

        //check left sum adn right sum value after each iteration and return the ith value for a particular index if they bth are equal
        for (int i = 0; i < arr.length; i++) {

            //calculate right sum by removing the left sum value from total sum and removing the value at ith index
            rightSum=totalSum-leftSum-arr[i];

            //if leftsum equals right sum , return the particular index value
            if(leftSum==rightSum){
                return i;
            }

            //calculate left sum again
            leftSum+=arr[i];

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }


}
