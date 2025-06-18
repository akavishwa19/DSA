package Recursion;

public class SkipString {

    //objective is to return a string which doesnt contain the string "apple"
    //we need to remove all the occurrences of the string

    //nothing , we will just look up in the string if it starts with apple or not
    //if it does , we will passs the string after removing the string apple fromm it
    //if it doesnt start with apple , we can remove the first character and then look for the same in the rest of the string , that is basically passing the rest of the string in the function call

    static String skipApple(String str){

        //if its empty , just return the string
        if(str.isEmpty()){
            return str;
        }

        //if it starts with apple , remove the apple from the string and pass rest of the string into the function call
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }

        //otherwise , just add the character snd pass the rest of the string into the function call
        return str.charAt(0) + skipApple(str.substring(1));
    }
    public static void main(String[] args) {

        System.out.println(skipApple("abappleabab"));

    }
}
