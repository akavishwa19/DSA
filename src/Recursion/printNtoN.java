package Recursion;

public class printNtoN {

    static void print(int n){

        //print numbers while we push into the call stack
        //print numbers again while the call stack is getting emptied

        if(n==1){
            System.out.println(1);
            return;
        }

        System.out.println(n);
        print(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {

        print(5);

    }
}
