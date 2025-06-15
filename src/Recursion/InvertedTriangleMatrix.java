package Recursion;

public class InvertedTriangleMatrix {

    //we are simply printing the triangle but we are logging it only when the function is removed from the call stack
    static void print(int row, int col){
        if(row==0){
            return;
        }

        if(col==0){
            print(row-1,row-1);
            System.out.println();
            return;
        }


        print(row,col-1);
        System.out.print(" * ");


    }

    public static void main(String[] args) {
        print(4,4);
    }
}
