package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsInString {

    static boolean checkInclusion(String s1, String s2) {

        List<String> list = new ArrayList<>();
        list=getPermutations("",s1);

        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {

            if(s2.contains(list.get(i))){
                return true;
            }
        }

        return false;


    }

    static List<String> getPermutations(String unprocessed , String processed){

        //base case
        if(processed.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //focus element
        char focus_element = processed.charAt(0);

        //answer list
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i <=unprocessed.length() ; i++) {

            String firstHalf=unprocessed.substring(0,i);
            String secondHalf=unprocessed.substring(i);

            answerList.addAll(getPermutations(firstHalf+focus_element+secondHalf , processed.substring(1)));
        }

        return answerList;

    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("prosperity","prosperity"));
    }
}
