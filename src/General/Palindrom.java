package General;

public class Palindrom {

    static int reverse(int x){

        int reversed_number=0;

        while(x>0){
            int digit=x%10;
            reversed_number=10*reversed_number+digit;
            x=x/10;
        }



        return reversed_number;
    }

    static boolean isPalindrome(int x) {
        int reversed=reverse(x);

        return x==reversed;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
