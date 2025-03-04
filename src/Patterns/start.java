package Patterns;

import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            for(int k=n;k>i;k--){
                System.out.print(n-k+1);
            }
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
