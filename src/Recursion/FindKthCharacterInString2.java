package Recursion;



public class FindKthCharacterInString2 {

//    static String alterString(String str){
//        int n=str.length();
//
//        String temp="";
//
//        for (int i = 0; i < n ; i++) {
//
//            char ch;
//
//            if(str.charAt(i)=='z'){
//                ch='a';
//            }
//            else{
//                ch = (char)(str.charAt(i)+1);
//            }
//
//            temp+=ch;
//        }
//
//        return temp;
//
//    }
//
//    static char kthCharacterHelper(String str,long k,int[] operations,int steps){
//
//        //if the word becomes greater than k , return the kth character
//        if(steps==operations.length){
//            return str.charAt((int)(k-1));
//        }
//
//        if(operations[steps]==0){
//            str=str+str;
//        }else{
//            str=str+alterString(str);
//        }
//
//        return kthCharacterHelper(str,k,operations,steps+1);
//
//    }
//
//    static char kthCharacter(long k,int[] operations){
//        return kthCharacterHelper("a",k,operations,0);
//    }

//    static String alterString(String str){
//        int n=str.length();
//
//        StringBuilder sb=new StringBuilder("");
//
//        for (int i = 0; i < n ; i++) {
//
//            char ch;
//
//            if(str.charAt(i)=='z'){
//                ch='a';
//            }
//            else{
//                ch = (char)(str.charAt(i)+1);
//            }
//
//            sb.append(ch);
//        }
//
//        return sb.toString();
//
//    }
//
//    static char kthCharacterHelper(String str,long k,int[] operations,int steps){
//
//        //if the word becomes greater than k , return the kth character
//        if(steps==operations.length){
//            return str.charAt((int)(k-1));
//        }
//
//        StringBuilder newStr = new StringBuilder();
//
//        if(operations[steps]==0){
//            newStr.append(str).append(str);
//        }else{
//            newStr.append(str).append(alterString(str.toString()));
//
//        }
//
//        return kthCharacterHelper(newStr.toString(),k,operations,steps+1);
//
//    }
//
//    static char kthCharacter(long k,int[] operations){
//        return kthCharacterHelper("a",k,operations,0);
//    }

    static String alterString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i) == 'z' ? 'a' : (char)(str.charAt(i) + 1);
            sb.append(ch);
        }
        return sb.toString();
    }

    static void appendTempString(StringBuilder sb, int val) {
        if (val == 0) {
            // Operation 0: Double the string
            String current = sb.toString();
            sb.append(current);
        } else {
            // Operation 1: Append altered string
            String current = sb.toString();
            sb.append(alterString(current));
        }
    }

    static char kthCharacter(long k, int[] operations) {
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < operations.length; i++) {
            appendTempString(sb, operations[i]);
        }
        return sb.charAt((int)(k - 1));
    }
    public static void main(String[] args) {
        int[] operations={0,1,0,1};
        System.out.println(kthCharacter(10,operations));
    }

}
