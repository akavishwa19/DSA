package Patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=0;k<(i*2)+1;k++){
                System.out.print("*");
            }

            for(int j=n;j>i;j--){
                System.out.print(" ");
            }


            System.out.println();
        }

    }
}
