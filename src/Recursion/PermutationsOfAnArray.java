package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAnArray {

    static List<List<Integer>> getPermutations(int[] nums){

        //generate a list of numbers from the array for easy manipulation
        List<Integer> list = new ArrayList<>();

        //add the value of the array into the list
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        //return the list after making permutations
        return generatePermutations(new ArrayList<>(),list);

    }

    static List<List<Integer>> generatePermutations(List<Integer> unprocessed , List<Integer> processed){

        //base case
        if(processed.isEmpty()){
            //generate an answer list and return
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(unprocessed));
            return list;
        }

        //get the focus element
        int focus_element = processed.get(0);

        //generate the answer list to generate all answers
        List<List<Integer>> answerList = new ArrayList<>();

        //iterate over the unprocessed and add at particular indexes
        for (int i = 0; i <=unprocessed.size() ; i++) {

            //list to generate permutations
            List<Integer> permutations = new ArrayList<>(unprocessed);

            //add the focus element to the processed at ith index
            permutations.add(i,focus_element);

            //subtract the resultant after removing the particular element

            List<Integer> removed = new ArrayList<>(processed);
            removed.remove(0);

            //make the recursion call and store the result in an array list
            answerList.addAll(generatePermutations(permutations,removed));

        }

        //finally return the answer list
        return answerList;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(getPermutations(arr));
    }
}
