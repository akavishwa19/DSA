package Patterns;

public class CharcaterPyramid {

    static void print(int n){
        for (int i = 0; i < n; i++) {

            //print spaces
            for (int j = 0; j < n-i ; j++) {
                System.out.print("  ");
            }

            //print characters
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A'+j) + " ");
            }

            //print characters
            for (int j = i-1; j >= 0 ; j--) {
                System.out.print((char)('A'+j) + " ");
            }

            //print spaces again
            for (int j = 0; j < n-i ; j++) {
                System.out.print("  ");
            }

            //move down
            System.out.println();

        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
