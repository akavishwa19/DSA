package Strings;

import java.util.Scanner;

public class ValidPalindrome {

    static boolean validatePalindrome(String str){
        str=str.toLowerCase();
        str=removeAlphaNum(str);

        String revString="";
        for(int i=str.length()-1;i>=0;i--){
            revString+=str.charAt(i);
        }

        System.out.println(str + " " + revString);

        return str.equals(revString);

    }

    static String removeAlphaNum(String str){
        String temp="";
        for(int i=0;i<str.length();i++){
            if(isAlphaNum(str.charAt(i))){
                continue;
            }
            temp+=str.charAt(i);

        }

        System.out.println(temp);

        return temp;
    }

    static boolean isAlphaNum(char ch){
        if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validatePalindrome("A man, a plan, a canal: Panama"));
    }
}
