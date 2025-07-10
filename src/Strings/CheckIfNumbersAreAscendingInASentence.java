package Strings;

public class CheckIfNumbersAreAscendingInASentence {

    static boolean areNumbersAscending(String s){
        //a temp variable to track least possible value

        //split the string and put it into a string array
        String[] str = s.split(" ");

        //assign the lowest value to the vakues that is used to check the number token form the string array
        int val=Integer.MIN_VALUE;

        //iterate over the splitted array
        for (int i = 0; i < str.length ; i++) {

            //we are at the current token ,  if the first letter of the token is a digit , that means the whole token is a number
            if(Character.isDigit(str[i].charAt(0))){

                //parse the string to integer
                int parsedString= Integer.parseInt(str[i]);

                //if the parsed string that is equivalent to the number value , is greater than the previously encountered token integer , make it the new current value ,
                //if it is decreasing , simply return false
                if(parsedString>val){
                    val=parsedString;
                }
                else {
                    return false;
                }
            }
        }

        //if we are able to iterate till the end , that means the string is ascending
        return true;

    }
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }
}
