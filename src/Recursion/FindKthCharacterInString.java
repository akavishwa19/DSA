package Recursion;

public class FindKthCharacterInString {

    static String alterString(String str){
        int n=str.length();

        String temp="";

        for (int i = 0; i < n ; i++) {

            char ch;

            if(str.charAt(i)=='z'){
                ch='a';
            }
            else{
                ch = (char)(str.charAt(i)+1);
            }

            temp+=ch;
        }

        return temp;

    }

    static char kthCharacterHelper(String str,int k){

        //if the word becomes greater than k , return the kth character
        if(str.length()>k){
            return str.charAt(k-1);
        }

        str=str+alterString(str);
        return kthCharacterHelper(str,k);

    }

    static char kthCharacter(int k){
        return kthCharacterHelper("a",k);
    }

    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }
}
