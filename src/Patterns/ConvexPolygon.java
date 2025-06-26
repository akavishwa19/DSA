package Patterns;

public class ConvexPolygon {

    static void print(int n){
        for (int i = 1; i <= n; i++) {

            //print the first set of sequence till i
            for (int j = 0; j <i ; j++) {
                System.out.print(j+1 + " ");
            }

            //print spaces ==> decremental
            for (int j = 0; j <n-i ; j++) {
                System.out.print("  ");
            }

            //print spaces ==> decremental
            for (int j = 0; j <n-i ; j++) {
                System.out.print("  ");
            }

            //print number
            //good one here , we go from i to 0
            for (int j = i; j > 0 ; j--) {
                System.out.print((j) + " ");
            }

            //move down
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
