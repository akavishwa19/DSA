package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

    static void printPermutations(String unprocessed,String str){

        if(str.isEmpty()){
            System.out.println(unprocessed);
            return;
        }

        //get the focus element that needs to be appended in positions
        char focus_element=str.charAt(0);
        //we can have multiple recursive calls based on the length of unprocessed string
        //for a string of length n . we can have n=1 places where we place our character
        //so after each step , the recursivce calls will grow

        for(int i=0;i<=unprocessed.length();i++){

            //get the first half
            String first=unprocessed.substring(0,i);

            //get the second half
            String second= unprocessed.substring(i);

            //call for permutations
            printPermutations(first+focus_element+second , str.substring(1) );

        }

    }

    static List<String> generatePermutations(String unprocessed, String str){

        if(str.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //get the focus element that needs to be appended in positions
        char focus_element=str.charAt(0);
        //we can have multiple recursive calls based on the length of unprocessed string
        //for a string of length n . we can have n=1 places where we place our character
        //so after each step , the recursivce calls will grow

        //create a list that stores all the answers copming from the recursion calls
        List<String> answerList=new ArrayList<>();

        for(int i=0;i<=unprocessed.length();i++){

            //get the first half
            String first=unprocessed.substring(0,i);

            //get the second half
            String second= unprocessed.substring(i);

            //call for permutations
            answerList.addAll(generatePermutations(first+focus_element+second , str.substring(1) ));

        }

        //return the answer list to the previous recursion call
        return answerList;

    }

    //count number of permutations
    static int countPermutations(String unprocessed , String str){
        if(str.isEmpty()){
            return 1;
        }

        int count=0;

        char focus_element=str.charAt(0);

        for(int i=0;i<=unprocessed.length();i++){

            String first=unprocessed.substring(0,i);
            String last=unprocessed.substring(i);
            count=count+ countPermutations(first+focus_element+last,str.substring(1));
        }

        return count;

    }

    static void printSubsets(String unprocessed,String str){
        //base case
        if(str.isEmpty()){
            System.out.println(unprocessed);
            return;
        }
        char focused_element=str.charAt(0);
        //take
        printSubsets(unprocessed+focused_element,str.substring(1));
        //dont take
        printSubsets(unprocessed,str.substring(1));
    }

    static ArrayList<String> returnSubsets(String unprocessed, String str){
        //base case
        if(str.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(unprocessed);
           return list;
        }
        char focused_element=str.charAt(0);
        //take
        ArrayList<String> left= returnSubsets(unprocessed+focused_element,str.substring(1));
        //dont take
        ArrayList<String> right=returnSubsets(unprocessed,str.substring(1));

        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
//        ArrayList<String> list = returnSubsets("","abc");
//        System.out.println(list);

        List<String> list= generatePermutations("","abc");
        System.out.println(list);

        System.out.println(countPermutations("","abcd"));
    }
}
