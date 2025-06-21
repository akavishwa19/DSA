package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DieRollWithTargetSum {

    static void dieRoll(String unprocessed , int target){
        if(target==0){
            System.out.println(unprocessed);
            return;
        }

        for(int i=1;i<=6 && i<=target;i++){
            dieRoll(unprocessed+i,target-i);
        }

    }

    static ArrayList<String> returnDieRoll(String unprocessed , int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        ArrayList<String> answer=new ArrayList<>();

        for(int i=1;i<=6 && i<=target;i++){
           answer.addAll(returnDieRoll(unprocessed+i,target-i));
        }

        return answer;

    }
    public static void main(String[] args) {
          ArrayList<String> list = returnDieRoll("",4);
        System.out.println(list);
    }
}
