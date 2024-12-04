package Array;

public class CanPlaceFlowers {

    static boolean place_flowers(int[] nums, int n){

        //get the length
        int len=nums.length;

        //variable to iterate
        int i=0;

        //move till the length of array
        while(i<len){

            //check for the begining of the array
            //if the position is held with 0 value , and the next position is also zero
            //we can add the flower
            //for adding flower , we replace the particular index value with 1 and decrement the value of n

            if(i==0){

                //we need to hande the case where we have only one flower in the flowerbed , so
                //we are checking if length is 1 and that particular index has value zero , only then we are adding
                //if length is not one , we can check with the next element
                if(nums[i]==0 && ( len==1 ||  nums[i+1]==0)){
                    nums[i]=1;
                    n--;

                }
                i++;

            }

            //for the case where we are at the last index , we need to check if tghe previous value is 0 or not
            else if(i==len-1){

                if(nums[i]==0 && nums[i-1]==0){
                    nums[i]=1;
                    n--;

                }
                i++;
            }

            //for rest of the cases , we can simply check if the trailing and succeeding value is zero or not
            else{

                if(nums[i]==0){
                    if(nums[i-1]==0 && nums[i+1]==0){
                        nums[i]=1;
                        n--;

                    }
                }
                i++;
            }

            //if we have put the flower and we are left with no flowers
            //we can just return true

            if(n<=0){
                return true;
            }

        }

        System.out.println(n);

        //at the end of iteration , we were not able to place all flowers so return false
        return false;
    }
    public static void main(String[] args) {
        System.out.println(place_flowers(new int[]{0,0,1,0,0},1));
    }
}
