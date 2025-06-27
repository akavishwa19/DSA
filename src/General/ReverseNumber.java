package General;

public class ReverseNumber {

    static int reverse(int x){
        boolean negative=false;
        if(x<0){
            x=-x;
            negative=true;

        }

        int digits = (int) (Math.log10(x)) + 1;
        int rev_num = 0;

        while (x > 0) {
            int last_digit = x % 10;
            rev_num = (int) (rev_num + last_digit * Math.pow(10, digits - 1));
            x = x / 10;
            digits--;
        }

        System.out.println(Integer.MAX_VALUE);

        if(rev_num >= Integer.MAX_VALUE){
            return 0;
        }

        if(negative){
            return -rev_num;
        }
        return rev_num;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
