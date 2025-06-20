package Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class SubsetsIterative {

    //logic is such that suppose we have an array [1,2,3]
    //its the same accept and reject mechanism here as well
    //consider for the first value of the array , 1
    //we either take it or reject it , so it gives us
    //  [[1],[]]

    //now for the second elemnt of the array , either take it or reject it
    //the answer from the previos step will remain as it is , just that we will have a copy of them and added into the existing list with current array element
    //thereforre not we will have
    //  [[],[1],[2],[1,2]]

    //its similar to duplicating the original list and then multiplying the current array elemnt to the copied list -> more like appending than multiplying

    //next step we have got 3
    //so following the same process

    //duplicate the previos answer ,
    //  [[],[1],[2],[1,2]  [],[1],[2],[1,2]]

    //now append to the copied list , the value that we have at the current index in our array
    //  [[],[1],[2],[1,2]  [3],[1,3],[2,3],[1,2,3]]

    //and now if we notice , this is out final answer also right

    //so we have deviced the logic , also a thing to notice is we have a list of lists in te answer




    static List<List<Integer>> generateSubsets(int[] arr){

        //this is my list that is going to be the answer , this will expand and copy items and finally get returned
        List<List<Integer>> outer=new ArrayList<>();
        System.out.println("outer" +outer );
        outer.add(new ArrayList<>());
        System.out.println("outer" +outer );

        //for each element , we will be doing operations with our outer list
        for(int num:arr){

            //get the size of list as we need those many copies to be made
            int size_of_list=outer.size();
            System.out.println("size of list initially: "+size_of_list);

            //make those many copies
            for (int i = 0; i <size_of_list ; i++) {
                //we will create an internal list that is noth8ing but a copy of the existing list
                List<Integer> inner = new ArrayList<>(outer.get(i));  //a shortcut to copy
                System.out.println("inner before: "+inner);
                inner.add(num); // add the present value to the inner list
                System.out.println("inner after: "+inner);
                outer.add(inner); // add this current list into outer
            }

        }
        return outer;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};

        List<List<Integer>> answer = generateSubsets(arr);
        for(List<Integer> ans:answer){
            System.out.println(ans);
        }
    }
}
