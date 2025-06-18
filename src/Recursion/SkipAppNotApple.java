package Recursion;

public class SkipAppNotApple {

    //objectuive is to remove the string "app" from a given string but in case it is "apple , then dont remove it
    // eg: bdapplefg ==> bdapplefg
    // eg: bdappfg ==> bffg

    static String skipAPpNotApple(String str){
        //base case: when the string becomes empty , simply return the string
        if(str.isEmpty()){
            return str;
        }

        //if the string starts from app and not apple , remove the app part and pass the rest of the string in the function call
        if(str.startsWith("app") && !str.startsWith("apple") ){
            return skipAPpNotApple(str.substring(3));
        }
        return str.charAt(0)+skipAPpNotApple(str.substring(1));

    }
    public static void main(String[] args) {
        System.out.println(skipAPpNotApple("bdfgapplebdfg"));
    }
}
