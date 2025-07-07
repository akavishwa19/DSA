package Array;

public class MaximumAverageSubarray {

    static double findMaxAverageWrongSolution(int[] nums,int k){

        double maxAverage = Double.MIN_VALUE;

        for (int i = 0; i < k && i < nums.length; i++) {

            double tempSum=0;

            for (int j = 0; ( ( i+j ) < nums.length) && ( j < k ) ; j++) {

                System.out.println( "current value " + nums[i+j] + " sum :"+i+j);
                tempSum+=nums[i+j];

            }

            System.out.println("net "+k + " for : "+tempSum);
            System.out.println();
            double tempAverage=tempSum/k;
            maxAverage=Math.max(tempAverage,maxAverage);
        }

        return maxAverage;

    }

    static double findMaxAverage(int[] nums,int k){
        //this is a classic sliding window problem , first get the sum of our window , calculate its average and store it in a variable
        //move ahead and add the current element to the window sum ans subtract the first value from the window sum and again get the average
        //move till the end and return the maximum average sum

        double windowSum=0;
        //calculate the window sum
        for (int i = 0; i < k; i++) {
            windowSum+=nums[i];
        }

        //average of window sum
        double maxAverage=windowSum/k;

        //start from the point where window sum ended , that is nothing but k
        //move k till end to move the window forward
        for (int i = k; i < nums.length ; i++) {

            //calculate new window sum
            windowSum = windowSum + nums[i] - nums[i-k];
            double tempWindowAverage=windowSum/k;

            //assign max average to greatest window average
            maxAverage = Math.max(tempWindowAverage,maxAverage);

        }

        //return max average
        return maxAverage;

    }
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}
