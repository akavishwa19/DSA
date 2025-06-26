package Patterns;

public class InvertedCharacterTriangle {

    static void print(int n){
        for (int i=0;i<n;i++){
            for (int j = 0; j < n-i ; j++) {
                System.out.print((char)('A'+j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
