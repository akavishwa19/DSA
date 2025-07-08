package Array;

public class FindTheHighestAltitude {

    static int largestAltitude(int[] gain){

        int maxSum=0;
        int sum=0;

        for (int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            if (sum>maxSum){
                maxSum=sum;
            }
        }

        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
}
