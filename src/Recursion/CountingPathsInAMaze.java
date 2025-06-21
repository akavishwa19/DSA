package Recursion;

public class CountingPathsInAMaze {

    //problem is that we have a maze , we need to go from noe point to another point
    //for nXn matrix , we need to go from 0,0 to n,n
    //the rule is that we can only move towards right or downwards , thats it

    static int countPaths(int r,int c){

        //if we reach any of the rows or columns where there is only one way to go , then we have a possible path
        //the last row and last colum is the one'th index , so we have an answer as we reach any of those
        if(r==1 || c==1){
            return 1;
        }

        //else just make recursive calls with moving right and moving down;
        int right = countPaths(r,c-1);
        int down = countPaths(r-1,c);

        return right+down;

    }

    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
    }
}
