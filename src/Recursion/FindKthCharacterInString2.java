package Recursion;

public class FindKthCharacterInString2 {

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

    static char kthCharacterHelper(String str,long k,int[] operations,int steps){

        //if the word becomes greater than k , return the kth character
        if(steps==operations.length){
            return str.charAt((int)(k-1));
        }

        if(operations[steps]==0){
            str=str+str;
        }else{
            str=str+alterString(str);
        }

        return kthCharacterHelper(str,k,operations,steps+1);

    }

    static char kthCharacter(long k,int[] operations){
        return kthCharacterHelper("a",k,operations,0);
    }
    public static void main(String[] args) {
        int[] operations={0,1,0,1};
        System.out.println(kthCharacter(10,operations));
    }

}
