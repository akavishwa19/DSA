package Recursion;

public class PrintStars {

    static void print_stars(int n){

        if(n==0){
            return;
        }

        for (int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();

        print_stars(n-1);
    }

    static void print_no_recursion(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print_recursion(int row,int col){

        if(row==0){
            return;
        }

        if(col<=0){
            System.out.println();
            print_recursion(row-1,row-1);
        }

        System.out.print("*");
        print_recursion(row,col-1);



    }
    public static void main(String[] args) {
        print_recursion(4,4);
    }
}
