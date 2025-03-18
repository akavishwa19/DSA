package Recursion;

public class print1ToN {

    static void print(int n,int i){
        if(i==n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        print(n,i+1);
    }

    static void printOptimised(int n){
        //okay here , the idea is that , when the function is pushed into the stack , it is not doing anything
        //at the time of removal from stack , the function executes by printing the value
        //basically when the next function call is removed from a point it returns to the same place where it was called from
        //so the further lines will get executed
        //that is why , we will print the value of n from where the function was called in the call stack

        if(n==1){
            System.out.println(1);
            return;
        }

        printOptimised(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        printOptimised(5);
    }

}
