package Recursion;

import java.util.*;
import Collection_framework.Arraylist;

public class LinearSearchMultiple {

    static ArrayList<Integer> list =new ArrayList<Integer>();
    static void search(int[] arr,int index,int target){

        //if we cross the index value outside of the length , the element is not present
        if(index>arr.length-1){
            return;
        }

        //if the element matched the target , return the index
        if(target==arr[index]){
            list.add(index);
        }

        //move the index ahead to search for that particular index of the array
        search(arr,index+1,target);

    }

    static ArrayList<Integer> searchListInBody(int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(index==arr.length){
            return list;
        }

        //if the element matched the target , return the index
        if(target==arr[index]){
            list.add(index);
        }

        ArrayList<Integer> answerList=searchListInBody(arr, target, index+1);
        list.addAll(answerList);

        return list;

    }

    static ArrayList<Integer> searchAnotherApproach(int[] arr,int index,int target,ArrayList<Integer> list){

        //if we cross the index value outside of the length , the element is not present , return the list
        if(index>arr.length-1){
            return list;
        }

        //if the element matched the target , add the index to the argument list
        if(target==arr[index]){
            list.add(index);
        }

        //move the index ahead to search for that particular index of the array
        return searchAnotherApproach(arr,index+1,target,list);

    }

    //conceptual stuff - returning on the array list
    static int sum(int n){

        //Iam in current function call
        System.out.println(n);

        if(n==5){

            //if the end is reached , return the value
            return n;
        }
        int sum=n;

        //while i return from the above function call , iam not directly returning , iam saving that value in some variable and manipulating it , then returning
        int answer=sum(n+1);
        System.out.println(sum + " , " + answer + " , " + n);
        sum+=answer;

        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,7,4,5};
//        search(arr,0,7);
//        System.out.println(list);
//
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        System.out.println(searchListInBody(arr,7,0));

        System.out.println(sum(1));
    }
}
