package Recursion;

public class ProductOfDigits {

    static int product(int n){

        if(n<10){
            return n;
        }

        return (n%10)*product(n/10);
    }
    public static void main(String[] args) {
        System.out.println(product(55));
    }
}
