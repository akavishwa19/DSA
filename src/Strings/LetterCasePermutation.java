package Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    static List<String> letterCasePermutation(String s){

        List<String> list = letterCasePermutationHelper("",s);
        return list;

    }

    static List<String> letterCasePermutationHelper(String unprocessed , String s){

        //base case
        if(s.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //answer list
        List<String> answerList = new ArrayList<>();

        if(Character.isLetter(s.charAt(0))){
            //left call
            answerList.addAll(letterCasePermutationHelper(unprocessed+Character.toLowerCase(s.charAt(0)),s.substring(1)));

            //right call
            answerList.addAll(letterCasePermutationHelper(unprocessed+Character.toUpperCase(s.charAt(0)),s.substring(1)));
        }
        else {
            answerList.addAll(letterCasePermutationHelper(unprocessed+s.charAt(0),s.substring(1)));
        }

        return answerList;

    }

    public static void main(String[] args) {

        List<String> list = letterCasePermutation("a1b2");
        System.out.println(list);

    }
}
