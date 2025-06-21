package Recursion;

import java.util.ArrayList;

public class PrintMazePathsWithDiagonal {

    static void printPathsWithDiagonal(String unprocessed , int r ,int c){

        //when row and column both are zero , simply print and return
        if(r==1 && c==1){
            System.out.println(unprocessed);
            return;
        }

        //we move diagonals in case we are not at ends
        if(r>1 && c>1){
            printPathsWithDiagonal(unprocessed+"X",r-1,c-1);
        }

        //if we have columns left , move right
        if(c>1){
            printPathsWithDiagonal(unprocessed+"R",r,c-1);
        }

        //if we have rows left , move down
        if(r>1){
            printPathsWithDiagonal(unprocessed+"D",r-1,c);
        }
    }

    static ArrayList<String> returnPathsWithDiagonal(String unprocessed , int r , int c){

        //when row and column both are zero , simply print and return
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        ArrayList<String> answerList=new ArrayList<>();

        //we move diagonals in case we are not at ends
        if(r>1 && c>1){
           answerList.addAll( returnPathsWithDiagonal(unprocessed+"X",r-1,c-1));
        }

        //if we have columns left , move right
        if(c>1){
            answerList.addAll( returnPathsWithDiagonal(unprocessed+"R",r,c-1));
        }

        //if we have rows left , move down
        if(r>1){
            answerList.addAll(  returnPathsWithDiagonal(unprocessed+"D",r-1,c));
        }

        return answerList;
    }
    public static void main(String[] args) {
        ArrayList<String> list=returnPathsWithDiagonal("",3,3);
        System.out.println(list);
    }
}
