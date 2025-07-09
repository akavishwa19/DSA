package Array;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    static List<List<Integer>> combine(int n, int k){
        List<Integer> list = generateList(n);
        List<Integer> unprocessed = new ArrayList<>();

        List<List<Integer>> answerList = generateCombinations(unprocessed,list,k);

        return  answerList;

    }

    static List<List<Integer>> generateCombinations(List<Integer> unprocessed , List<Integer> list,int steps){

        //base case
        if(steps==0){
            List<List<Integer>> tempList = new ArrayList<>();
            tempList.add(unprocessed);
            return tempList;
        }

        //answer list
        List<List<Integer>> answeerList = new ArrayList<>();

        //function calls

        for (int i = 0; i < list.size(); i++) {
            List<Integer> newUnprocessed = new ArrayList<>(unprocessed);
            newUnprocessed.add(list.get(i));
            answeerList.addAll(generateCombinations(newUnprocessed,list.subList(i+1,list.size()),steps-1));
        }

        return answeerList;

    }

    static List<Integer> generateList(int n){

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = combine(1,1);
        System.out.println(list);
    }
}
