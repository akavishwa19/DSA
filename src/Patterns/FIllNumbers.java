package Patterns;

public class FIllNumbers {

    static void print(int n){
        for (int i = 0; i < 2*n -1; i++) {
            for (int j = 0; j < 2*n-1; j++) {

                //get distance of the cell from all ends
                int top=i;
                int left=j;
                int right=2*n-2-j;
                int bottom=2*n-2-i;

                int minValue =  Math.min(bottom,Math.min(right,Math.min(top,left))) ;

                System.out.print(n-minValue +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
