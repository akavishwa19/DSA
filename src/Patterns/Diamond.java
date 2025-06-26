package Patterns;

public class Diamond {

    static void print(int n){
        //first print the upper half , then print the bottom half

        //upper triangle , incremental stars , decremental spaces
        for(int i=0;i<n;i++){

            //spaces
            for (int j = 0; j < n- i ; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 0; j < 2*(i) +1 ; j++) {
                System.out.print("* ");
            }

            //spaces
            for(int j=0;j<n-i ; j++){
                System.out.print("  ");
            }

            //move to next line
            System.out.println();
        }

        //lower triangle
        //incremental spaces , decremental stars

        for (int i = 0; i < n ; i++) {

            //print spaces
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");
            }

            //print stars
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("* ");
            }

            //print spaces again
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");
            }

            //move to next line
            System.out.println();

        }

    }
    public static void main(String[] args) {
        print(5);
    }
}
