package Patterns;

public class UniqueLeftCharacterTriangle {
    static void print(int n){
        for(int i=0;i<n;i++){
            for (int j = i; j >= 0 ; j--) {
                System.out.print((char)('A'+(n-j-1))+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
