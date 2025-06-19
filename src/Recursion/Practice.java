package Recursion;

public class Practice {

    static int practice(int n){
        if(n==1){
            return 1;
        }
        int answer= n + practice(n-1);
        System.out.println(answer);
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(practice(10));
    }
}
