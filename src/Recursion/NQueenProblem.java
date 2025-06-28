package Recursion;

public class NQueenProblem {

    //so the problem statement here is we will be given an NXN matrix and we have to place N queens on the board
    //the queen is nothing but a chess piece that attacks in all directions
    //coming to the point tat how is this is a recursion problem , we will put queens in the first row , at all positions one by one
    //for each queen in the first row , we will move to the second row and place queens in the second row , then the third row and so on
    //if we are able to place teh queens in all the rows , then we ahve placed the queen on out board

    //if we find an error while placing in a particular row such that we are not able to place a queen in the whole row , then we backtrack to the previous row
    //while placing we will keep checking if the quwwn placed is in a valid position or not

    //the logic to check if a queen is placed in the right position is that , it should not be attacking any other queen in the maze
    //while we place a queen , we need not check for queens in the below rows as there are no queens there at the moment

    //for a queen at (r,c)
    //no need to check bottom as there is no queen placed there at the moment
    //checking vertically up is easy , just decres the row value and keep the column value constant ==> (r--,c)
    //checking left diagonal is also easy , just decrease the left column and decrease the right column ==> (r--,c--)
    //checking the right diagonal is also easy , just increase the column and decrease the row ==> (r--,c++)

    //now the point is while checking the diagonal , how much should we move ==> when we reach the ends of our board
    //now , for a 4X4 board , at 2,2 ,
    //left diagonal => 2 columns are left , and 2 rows also , either of the end comes we need to stop , so min(2,2) ==> 2 moves
    //right diagonal ==> 1 column left , and 2 rows are at the top ==> min(2,1) ==> 1 move

    //if the marking starts from 0 , for (2,2) in 4X4 board , columns left in the left => 2 , columns in the right => total cols - columns in the left - 1 ==> 1
    //for (r,c) ==> left columns is r , since markings start from 0
    //              right columns is total - left cols -1

    //we are creating a function to display the number of ways in which we can place N queens on the board
    static int queens(boolean[][] board,int row){

        //we come out of our function call when we are done processing the end row
        if(row==board.length){
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count=0;

        //we will put our queens in the row column by column
        for(int col=0;col<board.length;col++){

            //if putting into the particular cell is safe , put it
            if(isSafe(board,row,col)){
                board[row][col]=true;

                //then start putting in the subsequent rows
                count = count + queens(board,row+1);

                //when this function returns , mark the visited cell false
                board[row][col]=false;

            }

        }

        return count;

    }

    static boolean isSafe(boolean[][] board , int row , int col){

        //check vertically upwards
        for (int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }

        //check the left diagonal
        //places we can move in the left
        int leftDistance=Math.min(row,col);

        //we iterate from 1 because we need to check the subtracted value from the current position
        for (int i=1;i<=leftDistance;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //check for the right diagonal
        //places we can go in the right
        int rightDistance=Math.min(row,board.length-col-1);

        //we iterate from 1 because we need to check the subtracted and added value from the current position based on row and column
        for (int i=1;i<=rightDistance;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }



    //function to display te board based on the position of queens
    static void displayBoard(boolean[][] board){
        for(boolean[] row:board){
            for (boolean cell:row){
                if(cell){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        boolean[][] board={
                {false , false , false , false},
                {false , false , false , false},
                {false , false , false , false},
                {false , false , false , false},
        };
        System.out.println(queens(board,0));
    }

}
