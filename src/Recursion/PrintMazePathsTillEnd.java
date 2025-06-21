package Recursion;

import java.util.ArrayList;

public class PrintMazePathsTillEnd {

    static void printPaths(String unprocessed , int r , int c){

        //we get our answer if both row and colum are at the end index
        if(r==1 && c==1){
            System.out.println(unprocessed);
            return;
        }

        //if colum is greater than 1 , that means that we are at the last row , so , we can move right
        if( c>1 ){
            printPaths(unprocessed+"R",r,c-1);
        }

        //if row is greater than 1 , that means we are at the last column , so  , we can move down
        if( r>1){
            printPaths(unprocessed+"D",r-1,c);
        }

    }

    static ArrayList<String> returnPaths(String unprocessed , int r , int c){

        //we get our answer if both row and colum are at the end index
        if(r==1 && c==1){
            ArrayList<String> list= new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        ArrayList<String> answerList=new ArrayList<>();

        //if colum is greater than 1 , that means that we are at the last row , so , we can move right
        if( c>1 ){
            answerList.addAll(returnPaths(unprocessed+"R",r,c-1));
        }

        //if row is greater than 1 , that means we are at the last column , so  , we can move down
        if( r>1){
            answerList.addAll(returnPaths(unprocessed+"D",r-1,c));
        }

        return answerList;

    }


    public static void main(String[] args) {
        ArrayList<String> list = returnPaths("",3,3);
        System.out.println(list);
    }
}
