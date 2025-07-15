package General;

public class ClimbingStairs {

    static int climbStairsRec(int n) {

        if(n==2){
            return 2;
        }

        if(n==3){
            return 3;
        }

        return climbStairs(n-2)+climbStairs(n-1);

    }

    static int climbStairs(int n) {

        int first=1;
        int second=2;

        if(n==1){
            return first;
        }

        if(n==2){
            return second;
        }

        int temp=0;

        for (int i = 0; i < n-2; i++) {
            temp=second;
            second=first+second;
            first=temp;
        }

        return second;

    }


    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
