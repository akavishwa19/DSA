package Recursion;

public class RecursionMatrix {

    static void print(int row, int col){
        if (row == 0) return;

        if (col == 0) {
            System.out.println();
            print(row - 1, row); // same col for each row for a square
            return;
        }

        System.out.print(" * ");
        print(row, col - 1);
    }
    public static void main(String[] args) {
        print(6,6);
    }
}
