package Patterns;

public class BinaryTriangle {

    static void print(int n){
        for (int i = 0; i < n ; i++) {
            for (int j=0;j<=i;j++){
                System.out.print( (i+j+1)%2 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
