package Recursion;

import java.util.Arrays;

public class PrintAllPathsAndMatrix {

    //take a look at the argument , we have the boolean maze wth those cells being true which could be a possible traversal for the solution'
    //an unprocessed string which is the path
    //the representation of the paths traversed by maze in the same order
    //the step number for the path in the matrix
    //row and column for traversal
    static void printPaths(String unprocessed,boolean[][] maze,int[][] mazeRep , int r,int c,int step){

        //the particular cell should be the step number
        mazeRep[r][c]=step;

        //base condition
        //if we reach the end point , simply print the maze representation and the path string
        if(r==maze.length-1 && c==maze[0].length-1 ){
            for(int[] nums:mazeRep){
                System.out.println(Arrays.toString(nums));
            }
            System.out.println(unprocessed+"\n");
            return;
        }
        //if we can go right , that means we have more columns , go right
        if(c < maze[0].length-1){
            printPaths(unprocessed+"R",maze,mazeRep,r,c+1,step+1);
        }

        //if we have more rows , move down
        if(r < maze.length-1){
            printPaths(unprocessed+"D",maze,mazeRep,r+1,c,step+1);
        }

        //when the funtion call returns , change the step representation to 0 in the maze representation cosisting of all the paths
        mazeRep[r][c]=0;

    }
    public static void main(String[] args) {
//       int[][] arr={
//               {1,2,3},
//               {1,2,3},
//               {1,2,3},
//               {1,2,4},
//
//       } ;
//
//       for(int[] nums:arr){
//           System.out.println(Arrays.toString(nums));
//       }

        int[][] mazeRep={
                {0,0,0},
                {0,0,0},
                {0,0,0},
        };

        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        printPaths("",maze,mazeRep,0,0,1);


    }
}
