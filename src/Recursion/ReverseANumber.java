package Recursion;

public class ReverseANumber {

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

    static int reverse_with_recursion(int n){

        if(n<10){
            return n;
        }

        //count number of digits to multiply with power value
        int digits=get_digit_count(n);

        //basically the same logic , multiply the remaining part of number and add digit to it
        return (int) Math.pow(10,digits-1)*(n%10) + reverse_with_recursion(n/10);
    }

    static int reverse_without_recursion_efficient(int n){

        //initialise rev with 0
        int rev=0;

        //iterate till number is greater than zero
        while(n>0){

            //extract digit
            int digit=n%10;

            //get reversed sum
            rev=rev*10 +digit;

            //remove the extracted didgit
            n=n/10;

        }

        return rev;
    }

    static int reverse_without_recursion_inefficient(int n){

        //initialise reversed number as 0
        int rev=0;

        //iterate till the number is greater than zero
        while(n>0) {
            //extract last digit
            int digit = n % 10;

            //get the count of digits
            int count = get_digit_count(n);

            //remove that last digit from the number
            n = n / 10;

            //reverse the number by multiplying with the place factor of digit and storing it in the number value
            rev += digit* Math.pow(10,count-1);
        }

        return rev;

    }

    public static void main(String[] args) {
        System.out.println(reverse_with_recursion(12354));
    }
}
