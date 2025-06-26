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
                {false , false , true  , false},
                {false , false , false , false},
                {false , false , false , false},
        };
        displayBoard(board);
    }

}
