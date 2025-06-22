package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class TraverseMazeWithRestrictions {

    //for a 2-D matrix
    //number of rows = arr.length
    //number of columns = arr[0].length

    //we will have a boolean maze with true as the cells where we can move and false as the restricted  cells
    //we will be starting from 0,0 and will be moving to the bottom most right point

    //we can only move down and right
    static void print(boolean[][] maze,String unprocessed,int r,int c){

        //we reach the destination when both row and column are at the end point
        if(r==maze.length-1 && c==maze[0].length-1 ){
            System.out.println(unprocessed);
            return;
        }

        if(maze[r][c]==false){
            return;
        }

        if(r<maze.length-1){
            print(maze,unprocessed+"D",r+1,c);
        }

        if(c<maze[0].length-1){
            print(maze,unprocessed+"R",r,c+1);
        }

    }

    static ArrayList<String> returnPaths(String unprocessed , boolean[][] maze,int r,int c){

        //whne both row and column reach the end point , return te paths
        //number of rows is length of the 2D matrix
        //number of columns is the length of first indexed array
        //rows => arr.length
        //columns => arr[0].length

        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(unprocessed);
            return list;
        }

        //in case we land on a restricted path , simply return from the function call , just return an empty array list
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        //create the answer list
        ArrayList<String> answer_list = new ArrayList<>();

        //when we have rows left , move down
        if(r<maze.length-1){
            //add the answer in the list
            answer_list.addAll(returnPaths(unprocessed+"D",maze,r+1,c));
        }

        //if we have columns left , mve right
        if(c<maze[0].length-1){
            answer_list.addAll(returnPaths(unprocessed+"R",maze,r,c+1));
        }

        //finally return the array list containing all the answers
        return answer_list;

    }

    static void printPathsWIthLimitedArgs(String unprocessed,boolean[][] maze,int r, int c){

        //if we reavh the last index , return uprocessed string
        if(r==1 && c==1){
            System.out.println(unprocessed);
            return;
        }


        //we can move right if we have columns ahead of us
        if(c>1){
            printPathsWIthLimitedArgs(unprocessed+"R",maze,r,c-1);
        }

        //we can move down if we have rows left
        if(r>1){
            printPathsWIthLimitedArgs(unprocessed+"D",maze,r-1,c);
        }

    }


    public static void main(String[] args) {

        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        ArrayList<String> list=returnPaths("",maze,0,0);
        System.out.println(list);

        printPathsWIthLimitedArgs("",maze,3,3);

    }
}
