package Recursion;

import java.util.Arrays;

public class PrintAllPathsAndMatrix {

    static void printPaths(String unprocessed,boolean[][] maze,int[][] mazeRep , int r,int c,int step){

        mazeRep[r][c]=step;

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

        if(r < maze.length-1){
            printPaths(unprocessed+"D",maze,mazeRep,r+1,c,step+1);
        }

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
