package Patterns;

public class Rectangle {

    static void print(int n){

        //rows
        for (int i=0;i<n;i++){

            if(i==0 || i==n-1 ){
                for (int j = 0; j < n+1 ; j++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");

                for (int j = 0; j <= n-2 ; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");

            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
