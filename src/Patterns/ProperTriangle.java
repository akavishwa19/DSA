package Patterns;

public class ProperTriangle {

    //first print the triangle with spaces , then print the triangle
    static void print(int n){
        for (int i = 0; i < n ; i++) {

            //triangle with spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }

            //triangle with stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("* ");
            }

            //again print spaces in left overs
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }

            //move to next line
            System.out.println();
        }

    }
    public static void main(String[] args) {
        print(3);
    }
}
