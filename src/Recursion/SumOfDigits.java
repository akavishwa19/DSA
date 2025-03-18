package Recursion;

import java.util.Scanner;

public class SumOfDigits {


    static int sum_without_recursion(int n){

        //convert the number to soul positive
        n=Math.abs(n);

        //answer variable to hold the sum of digits
        int answer=0;

        //iterate till the number becomes zero
        while(n>0){

            //find the last digit
            int digit=n%10;

            //remove the last digit
            n=n/10;

            //add the digits in the answer variable
            answer+=digit;
        }

        return answer;
    }

    static int sum_with_recursion(int n){
        //so here the idea is we will extract the last digit of the number and then , the last digit of the number except the last digit and so on
        //eg: 1234 --> 123 --> 12 -->1
        //for base case , if the number is less than 10 , return the number itself

        n=Math.abs(n);

        if (n < 10) {
            return n;
        }

        //find the last digit
        int last_digit=n%10;

        return last_digit+sum_with_recursion(n/10);

    }



    public static void main(String[] args) {

        System.out.println(sum_with_recursion(-22));

    }

}
