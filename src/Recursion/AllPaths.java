package Recursion;

public class AllPaths {

    static void allPaths(String unprocessed,int r,int c,boolean[][] maze){

        //if we reach the end , print the path
        if(r==maze[0].length-1 && c==maze.length-1){
            System.out.println(unprocessed);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;

        //if rows are left , move down
        if(r<maze.length-1){
            allPaths(unprocessed+"D",r+1,c,maze);
        }

        //if columns are left , move right
        if(c<maze[0].length-1){
            allPaths(unprocessed+"R",r,c+1,maze);
        }

        //if we have place to go up , move up
        if(r>0){
            allPaths(unprocessed+"U",r-1,c,maze);
        }

        //if we have place to go left , go left
        if(c>0){
            allPaths(unprocessed+"L",r,c-1,maze);
        }

        maze[r][c]=true;

    }
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPaths("",0,0,maze);

    }
}
