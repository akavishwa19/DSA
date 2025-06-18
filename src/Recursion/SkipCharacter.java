package Recursion;

public class SkipCharacter {

    static String removeRecursively(String str,String temp){
        //the idea is simple ,  we need to iterate iver the string and check for the character at 0th index , if the character is an a , we will call the function again but with removed
        //first letter and the removed character will be called in the function call for temp
        //when the charcater is not an a , simply call the function without first letter but add the first character in the temp string as well

        //if length of string becomes zero , simply return the temp argument
        if(str.length()==0){
            return temp;
        }

        //if it is a , call with rest of the string and original temp
        if(str.charAt(0)=='a'){
            return removeRecursively(str.substring(1),temp);
        }
        //if it is not a , call with rest of the string and temp with first letter appended into the temp argument
        return removeRecursively(str.substring(1),temp+str.charAt(0));
    }

    static String removeRecursivelyReverse(String str,String temp){

        //everything is same just that we are traversing from behind and appending at the beginning
        if(str.length()==0){
            return temp;
        }

        if(str.charAt(str.length()-1)=='a'){
            return removeRecursivelyReverse(str.substring(0,str.length()-1),temp);
        }
        return removeRecursivelyReverse(str.substring(0,str.length()-1),str.charAt(str.length()-1)+temp);
    }
    static String removeOptimised(String str){
        //the idea is simple ,  we need to iterate iver the string and check for the character at 0th index , if the character is an a , we will call the function again but with removed
        //first letter and the removed character will be called in the function call for temp
        //when the charcater is not an a , simply call the function without first letter but add the first character in the temp string as well

        //if length of string becomes zero , simply return the temp argument
        if(str.length()==0){
            return "";
        }

        //if it is a , call with rest of the string and original temp
        if(str.charAt(0)=='a'){
            return removeOptimised(str.substring(1));
        }
        //if it is not a , call with rest of the string and temp with first letter appended into the temp argument
        return str.charAt(0)+ removeOptimised(str.substring(1));
    }
    static String remove(String str){

        String temp="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='a' ){
                continue;
            }
            else {
                temp+=str.charAt(i);
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        System.out.println(removeOptimised("abcdbacd"));
    }
}
