package Recursion;

public class Factorial {

    static int factorial(int n){

        //what we need to do is
        //multiply till 1 and return the value after multiplication
        //also f(n)=n*f(n-1)
        //f(n-1)-(n-1)*f((n-1)-1)

        if(n==1){
            return 1;
        }

        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
