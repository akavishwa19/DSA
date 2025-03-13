package Recursion;

public class NthFibonnaci {


    //APPROACH TO SOLVE ANY RECURSIVE PROBLEM
    //check if it can be broken down into smaller problems
    //form a recurrence relation if needed
    //draw the recursive tree
    //in the tree , see the flow of functions , how they get into stack , identify and focus on left tree and right tree calls
    //draw the tree and understand it
    //see how the values are returned at each step
    //eee where the function call is coming out from

    static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {

        //always try to break down a bigger problem into smaller ones , to check if a problem can be solved using recursion or not
        //like in this case we cac see that nth number is (n-1)th + (n-2)th number
        //basically try to make a tree where we are able to break it into branches
        //create a recurrence relation
        //base condition is represented ny answers we already have
        //like here we know , f(0) is 0 and f(1) is 1

        System.out.println(fibo(4));

    }


}
