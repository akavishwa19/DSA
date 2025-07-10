package Strings;

public class CheckIfAllAsComesBeforeAllBs {

    static boolean checkString(String s) {
        //first ill try to find a b , if i find it , from that point ill try to find a
        //if we find an a , return false, else true

        //index to track the first occurence of b
        int index=0;

        //boolean to track the first occurence of b , if b is not found , assign b to false
        boolean bNotFound = true;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)=='b'){
                index=j;
                bNotFound=false;
                break;
            }
        }

        //if b not found , return true
        if(bNotFound){
            return true;
        }

        //find a after the index where b was found , if it is found return false
        for (int i = index; i < s.length() ; i++) {
            if(s.charAt(i)=='a'){
                return false;
            }
        }

        //if it is not found , return true
        return true;

    }
    public static void main(String[] args) {
        System.out.println(checkString("bbb"));
    }
}
