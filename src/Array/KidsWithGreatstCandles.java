package Array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatstCandles {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;


        //find largest
        int largest=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>largest){
                largest=candies[i];
            }
        }

        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=largest){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;

    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3},3));
    }
}
