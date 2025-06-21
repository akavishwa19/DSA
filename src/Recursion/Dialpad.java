package Recursion;

import java.util.ArrayList;

public class Dialpad {

    static void combinations(String unprocessed,String str){

        //if str is empty , simply return the unprocessed string
        if(str.isEmpty()){
            System.out.println(unprocessed);
            return;
        }

        //eg: '2'=2 , '1'=1
        int digit=Integer.parseInt(String.valueOf(str.charAt(0))); //digit is the focus element now , just that we took the particular character and returned the numerical value out of it

        //we need to traverse in batched based on the digit value
        //from (0-->2)
        //from (3-->5)
        //from (6-->8)
        //from ((digit-1)*3 --> digit*3)
        for(int i=(digit-1)*3;i<digit*3;i++){

            //get the charcater quivalent of that number value
            //simply add the value in 'a' and type cast to character
            char particular_character = (char)('a'+i);

            //make recursive calls for unprocessed string + particular character , and the string after removing the first element
            combinations(unprocessed+particular_character,str.substring(1));
        }
    }

    static ArrayList<String> returnCombinations(String unprocessed, String str){

        //if str is empty , simply return the unprocessed string
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //eg: '2'=2 , '1'=1
        int digit=Integer.parseInt(String.valueOf(str.charAt(0))); //digit is the focus element now , just that we took the particular character and returned the numerical value out of it

        //create your answer list
        ArrayList<String> answerList=new ArrayList<>();


        //we need to traverse in batched based on the digit value
        //from (0-->2)
        //from (3-->5)
        //from (6-->8)
        //from ((digit-1)*3 --> digit*3)
        for(int i=(digit-1)*3;i<digit*3;i++){

            //get the charcater quivalent of that number value
            //simply add the value in 'a' and type cast to character
            char particular_character = (char)('a'+i);

            //make recursive calls for unprocessed string + particular character , and the string after removing the first element
            answerList.addAll(returnCombinations(unprocessed+particular_character,str.substring(1)));
        }

        return answerList;
    }

    static ArrayList<String> leetcodeProblem(String unprocessed, String str){

        //if str is empty , simply return the unprocessed string
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //eg: '2'=2 , '1'=1 , since it is phone book , 1 corresponds to zero , so subtract 1 from whatever we get
        int digit=Integer.parseInt(String.valueOf(str.charAt(0)))-1; //digit is the focus element now , just that we took the particular character and returned the numerical value out of it

        //create your answer list
        ArrayList<String> answerList=new ArrayList<>();


        //we need to traverse in batched based on the digit value
        //from (0-->2)
        //from (3-->5)
        //from (6-->8)
        //from ((digit-1)*3 --> digit*3)
        for(int i=(digit-1)*3;i<digit*3;i++){

            //get the charcater quivalent of that number value
            //simply add the value in 'a' and type cast to character
            char particular_character = (char)('a'+i);

            //make recursive calls for unprocessed string + particular character , and the string after removing the first element
            answerList.addAll(leetcodeProblem(unprocessed+particular_character,str.substring(1)));
        }

        return answerList;
    }
    public static void main(String[] args) {
        ArrayList<String> list=leetcodeProblem("","");
        System.out.println(list);
    }
}
