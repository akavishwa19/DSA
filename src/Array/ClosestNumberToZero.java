package Array;

public class ClosestNumberToZero {
    static int findClosestNumber(int[] nums) {

        int closest=nums[0];
        for(int i=0;i<nums.length;i++){
            if( Math.abs(nums[i]) < Math.abs(closest)){
                closest=nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(closest)){
                if(nums[i]>closest){
                    closest=nums[i];
                }

            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums={-100000,-100000};
        System.out.println(findClosestNumber(nums));
    }
}
