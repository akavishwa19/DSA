package Array;

public class GreatestCommonDivisorOfStrings {

    //a function to calculate gcd of 2 numbers
    static int gcd(int m, int n) {
        int gcd = 1;

        int small = Math.min(m, n);

        for (int i = 2; i <= small; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    static String gcdOfStrings(String str1, String str2) {

        //get length of both strings
        int m = str1.length();
        int n = str2.length();

        //if we add up both the strings in opposite directions it should give me the same answer right
        //if it doesnt then they cant be divided by a gcd string
        if((str1+str2).equals(str2+str1)){

            //find gcd of both the string lengths
            int gcd=gcd(m,n);

            //return the gcd number of characters from the string
            return str1.substring(0,gcd);
        }
        else{
            return "";
        }


    }
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ab","abab"));
    }
}
