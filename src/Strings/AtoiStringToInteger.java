package Strings;

public class AtoiStringToInteger {

    static int myAtoi(String s) {

        //value to store our number
        //we are storiung it in long as our answer may exceed the range for integers
        long value=0;

        //trim the string to remove whitespaces from the string
        s=s.trim();

        //if the provided string is empty , simply return zero
        if(s.isEmpty()){
            return 0;
        }

        //get the first character to check signedness
        char start=s.charAt(0);

        //boolean to track signedness
        boolean isNegative = false;

        //if it starts with a - ,  take set number to be negative and remove the negative from the string
        if( start == '-'){
            isNegative=true;
            s=s.substring(1);

        //if it starts with a plus sign , set signedness boolean to be positive , remove the plus sign from the string
        }else if( start == '+') {
            isNegative=false;
            s=s.substring(1);

        //if no sign is provided , we can consider it positive
        }else {
            isNegative=false;
        }

        //iterate over the given string
        for (int i = 0; i < s.length(); i++) {

            //read the ith character
            char ch=s.charAt(i);

            //if it is not a digit , break
            if(!Character.isDigit(ch)){
                break;
            }

            //convert the character to the number equivalent
            int ch_equivalent = ch - '0';

            //update value to generate the number
            value = value*10 + ch_equivalent;

            //if value exceeds the range , check if signedness is negative , if that is the case , return the minimum range value otherwise return the maximum range value
            if(value>Integer.MAX_VALUE){
                if(isNegative){
                    return -Integer.MAX_VALUE-1;
                }else {
                    return Integer.MAX_VALUE;
                }

            }

        }

        //if the signedness is negative , return the negative value , else positive value
        if(isNegative){
            return -(int)value;
        }

        return (int)value;

    }
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
