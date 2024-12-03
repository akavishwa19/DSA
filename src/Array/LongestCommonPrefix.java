package Array;

public class LongestCommonPrefix {

    static String longest_prefix(String[] str){

        //answer to be returned
        String ans="";

        //iterate through all the characters of the first string
        for (int i=0;i<str[0].length();i++){

            //we will have a character that needs to be checked with all the other strings ith character
            char charToCheck=str[0].charAt(i);

            //iterate through the remaimg strings of the array
            for(int j=0;j< str.length;j++){

                //if the value of i is greater than the length of any of the strings of the array , simple we dont need to check as prefix cant be beyond a string length
                //if the particular character is unequal in any of the cases we can return our answer as well
                if( i>=str[j].length() || str[j].charAt(i)!=charToCheck){
                   return ans;
                }
            }
            //if it is found in all the strings , append the character to the answer string
            ans+=charToCheck;
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] str={"dog","racecar","car"};
        System.out.println(longest_prefix(str));
    }
}
