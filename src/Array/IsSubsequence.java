package Array;

import java.util.Arrays;

public class IsSubsequence {

//    static boolean isSubsequence(String s, String t) {
//
//        //arrray to store inexes
//        int[] store=new int[s.length()];
//
//        //iterate till the length of s to find if exists
//        for(int i=0;i<s.length();i++){
//
//            //a flag value to check if the elment was found or not
//            boolean found=false;
//            for(int j=0;j<t.length();j++){
//
//                //if the element is found , push the index n the srore array
//                if(s.charAt(i)==t.charAt(j)){
//                    store[i]=j;
//                    found=true;
//                    break;
//                }
//            }
//            //if element is not found , insert 0 at the index
//            if(!found){
//                store[i]=-1;
//            }
//        }
//
//        System.out.println(Arrays.toString(store));
//
//        boolean isAscending=true;
//        if(store.length==1){
//            if(store[0]>=0){
//                isAscending=true;
//            }
//            else{
//                isAscending=false;
//            }
//        }else{
//            for(int i=0;i<s.length()-1;i++){
//                if(store[i]<store[i+1]){
//                    isAscending=true;
//                }
//                else{
//                    isAscending=false;
//                    break;
//                }
//            }
//        }
//        //check if array is ascending , return false if not ascending
//
//
//        if(isAscending){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }

    static boolean isSubsequence(String s, String t) {


        //start from the zeroth index
        int i=0;
        int j=0;

        //iterate till either of i or j reaches length
        while(i<s.length() && j<t.length()){

            //if value at i matches j , check the next value
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }

            //in either case we need to increment j , if found , find in the string that is left
            // , if not found , again find in the string that is left
            j++;
        }

        //at the end of loop i is equal to length of string if all indices are found
        return i==s.length();



    }
    public static void main(String[] args) {
       String s = "b", t = "c";
        System.out.println(isSubsequence(s,t));
    }
}
