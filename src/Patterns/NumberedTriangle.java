package Patterns;

public class NumberedTriangle {
    
    static void print(int n){

        int current_count=0;

        for (int i=0;i<n;i++){
            for (int j = 0; j <=i ; j++) {
                current_count++;
                System.out.print(current_count + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
