package Collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsDuplicates {

    //when u find a duplicate element , only ad it in the newly created subset of previous step
    //beacuse of the above point , duplicates need to be together ,  so sort the array

    static int[] sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }

    //coming to the logic, its going to be the same as what we did previously to copy and add into the lists iterativelu
    //just that where we are wanting to append in case of copy elements
    static List<List<Integer>> subsetWithoutDuplicatesIterative(int[] arr){
        List<List<Integer>> upper=new ArrayList<>(); //create the result list
        upper.add(new ArrayList<>()); //initialise that list with empty array list

        //sort the array
        sort(arr);

        //take a start and an end pointer
        int start=0;
        int end=0;

        //iterate over the array
        for(int i=0;i<arr.length;i++){

            //when we enter the loop initially , start is zero
            start=0;

            //if the following element is same as the previous one ,change the start value to end+1 as its the new start now and we need to add into that part only
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }

            //end is the size of upper list -1 as we start the pointer from zero
            end=upper.size()-1;

            //get the size of the list
            int size_of_list=upper.size();

            //follow the same process , just start from the start value in case the elemnt is repeated else copy all the elements
            for(int j=start;j<size_of_list;j++){

                List<Integer> inner=new ArrayList<>(upper.get(j));
                inner.add(arr[i]);
                upper.add(inner);
            }
        }


        return upper;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> list = subsetWithoutDuplicatesIterative(arr);

        for(List val:list){
            System.out.println(val);
        }

    }
}
