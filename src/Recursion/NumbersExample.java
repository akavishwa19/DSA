package Recursion;

public class NumbersExample {

    //POINTS TO REMEMBER
    //while the function is not finished executing , it remains in the stack
    //when a function finished executing , it is removed from the stack and the flow of program is returned to where the function was called
    //function calling itself is recursion
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }

}
