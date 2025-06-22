package Recursion;

import java.util.Arrays;

public class PrintAllPathsInMatrixAllDirections {

    //we just want to go all directions and print all the paths

    static void printAllPaths(String unprocessed,boolean[][] maze , int[][] mazeRep,int r , int c , int step){

        //put the step value into the representation maze
        mazeRep[r][c]=step;

        //base condition
        if(r==maze.length-1 && c==maze[0].length-1 ){
            for(int[] nums:mazeRep){
                System.out.println(Arrays.toString(nums));
            }
            System.out.println(unprocessed+"\n");
            return;
        }

        //if the path is traversed , mark it to false
        if(!maze[r][c]){
            return;
        }

        //mark the traversed paths as false
        maze[r][c]=false;



        //if we have rows left , go down
        if(r<maze.length-1){
            printAllPaths(unprocessed+"D",maze,mazeRep,r+1,c,step+1);
        }

        //if we have columns left , go right
        if(c<maze[0].length-1){
            printAllPaths(unprocessed+"R",maze,mazeRep,r,c+1,step+1);
        }

        //if we can go up , go up
        if(r>0){
            printAllPaths(unprocessed+"U",maze,mazeRep,r-1,c,step+1);
        }

        //if we go left , we have columns on the left , go left
        if(c>0){
            printAllPaths(unprocessed+"L",maze,mazeRep,r,c-1,step+1);
        }

        //when the particular function call returns , mark it to true again
        maze[r][c]=true;

        //when we return , mark the representation maze to initially set representation maze
        mazeRep[r][c]=0;

    }

    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int[][] mazeRep={
                {0,0,0},
                {0,0,0},
                {0,0,0},
        };

        printAllPaths("",maze,mazeRep,0,0,1);
    }

}
