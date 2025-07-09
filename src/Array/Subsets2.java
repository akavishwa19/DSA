package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    static List<List<Integer>> subsets(int[] nums){

        List<Integer> list= convertArrayToList(nums);

        System.out.println(list);

        List<List<Integer>> answerList= subsetsHelper(new ArrayList<>(),list);

        return answerList;

    }

    static List<List<Integer>> subsetsHelper(List<Integer> unprocessed , List<Integer> processed){

        //base case
        if(processed.isEmpty()){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(unprocessed));
            return list;
        }

        List<List<Integer>> answerList = new ArrayList<>();

        //focus element
        int focus_element=processed.get(0);



        //right call
        answerList.addAll(subsetsHelper(unprocessed,processed.subList(1,processed.size())));

        //left calls

        //updated left arg
        List<Integer> newUnprocessed=new ArrayList<>(unprocessed);
        newUnprocessed.add(focus_element);

        answerList.addAll(subsetsHelper(newUnprocessed,processed.subList(1,processed.size())));

        return answerList;

    }

    static List<Integer> convertArrayToList(int[] nums){

        //sort the array , if duplicates are find , dont add in list
        Arrays.sort(nums);

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> list = subsets(arr);
        System.out.println(list);
    }
}
