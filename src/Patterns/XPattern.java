package Patterns;

public class XPattern {

    static void print(int n){

        //upper half
        for (int i = 0; i < n ; i++) {

            //incremental stars
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }

            //decremental spaces
            for (int j = i+1; j < n; j++) {
                System.out.print("  ");
            }

            //decremental spaces
            for (int j = i+1; j < n; j++) {
                System.out.print("  ");
            }

            //incremental stars
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }

            //move down
            System.out.println();

        }

        //lower half
        for (int i = 0; i < n-1; i++) {

            //decremental stars
            for (int j = i; j < n-1; j++) {
                System.out.print("* ");
            }

            //incremental spaces
            for (int j = 0; j <=i ; j++) {
                System.out.print("  ");
            }

            //incremental spaces
            for (int j = 0; j <=i ; j++) {
                System.out.print("  ");
            }

            //decremental stars
            for (int j = i; j <n-1 ; j++) {
                System.out.print("* ");
            }

            //move down to next line
            System.out.println();

        }

    }
    public static void main(String[] args) {
        print(4);
    }
}
