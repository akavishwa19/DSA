package Recursion;

public class Palindrome {

    static int get_digit_count(int n){
        //initially set count to 0
        int count=0;

        //iterate till the number is greater than 0
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    static int reverse_with_recursion(int n , int original){

        //conditionally convert to string


        if(n<10){
            return n;
        }

        //count number of digits to multiply with power value
        int digits=get_digit_count(n);

        //basically the same logic , multiply the remaining part of number and add digit to it
        return (int) Math.pow(10,digits-1)*(n%10) + reverse_with_recursion(n/10 , original);
    }
    public static void main(String[] args) {

    }
}
