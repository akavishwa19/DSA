package Recursion;

public class TriangleMatrix {

    static void print(int row, int col){

        //if row becomes zero ,  simple return
        if(row==0){
            return;
        }

        //if column is zero , start printing next rows , finally return also else it goes endlessly
        if(col==0){
            System.out.println();
            print(row-1,row-1);
            return;
        }

        //for rest of the cases , just print the current row by decrementing the column value
        System.out.print(" * ");
        print(row,col-1);



    }

    public static void main(String[] args) {
    print(4,4);
    }

}
