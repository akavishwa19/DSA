package Patterns;

public class RightHalfDiamond {

    static void print(int n){

        //print the upper half then the lower half
        for (int i = 0; i < n; i++) {

            //star
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            //decremental stars
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
