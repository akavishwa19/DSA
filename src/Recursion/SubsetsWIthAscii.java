package Recursion;

import java.util.ArrayList;

public class SubsetsWIthAscii {

    static int getAscii(char ch){
        return (ch+0);
    }

    static ArrayList<String> subsetWithAscii(String str,String temp){

        //base case
        if(str.isEmpty() ){

            ArrayList<String> list=new ArrayList<>();
            if(!temp.isEmpty()){
                list.add(temp);
            }
            return list;
        }

        char ch=str.charAt(0);

        //ignore
        ArrayList<String> leftList = subsetWithAscii(str.substring(1),temp);

        //consider
        ArrayList<String> midList = subsetWithAscii(str.substring(1),ch+temp);

        //Ascii
        ArrayList<String> rightList = subsetWithAscii(str.substring(1),temp+getAscii(ch));

        leftList.addAll(midList);
        leftList.addAll(rightList);

        return leftList;

    }
    public static void main(String[] args) {
        System.out.println(subsetWithAscii("abc",""));
    }
}
