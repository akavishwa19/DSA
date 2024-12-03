package Array;

public class BestTimeToBuySellStocks {

    static int maxProfit(int[] arr) {
        //2 pointers i and j
        int i=0;
        int j=1;
        int len=arr.length;

        //value to be returned
        int val=0;

        //iterate till j reaches end
        while(j<len){

            //if the succesding stcok is greater
            //calculate the stcok value and additionally check that the differnce value is greater than
            //value that exists
            if(arr[j]>=arr[i]){
                if(arr[j]-arr[i]>val){
                    val=arr[j]-arr[i];
                }
                //move j ahead as we can have a bigger difference waiting
                j++;

            }
            else{

                //if the successing value is not greater , we can simply move j ahead also , we dont need
                //to compare it with previous i values , so assign j to i , and increment j
                i=j;
                j++;
            }

        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
