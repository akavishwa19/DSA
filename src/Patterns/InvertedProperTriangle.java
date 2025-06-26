package Patterns;

public class InvertedProperTriangle {
    
    static void print(int n){
        //first print the spaces and then the stars , but the catch is stars are decremental and spaces are incremental
        
        //number of rows
        for(int i=0;i<n;i++){
            //print spaces
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");
            }

            //print stars
            for(int j= 2*(n-i)-1;j>0;j--){
                System.out.print("* ");
            }

            //print spaces
            for (int j = 0; j <= i ; j++) {
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
