package Recursion;

public class Steps {
    public static int numberOfSteps(int num) {

        //since we need to return the steps , till we reac the final step , we have to maintain the count,
        //we are passing it to another helper in this case

        return countSteps(num,0);

    }

    public static int countSteps(int num,int steps){


        //if the number becomes zero , just return the steps
        if(num==0){
            return steps;
        }

        //if number is even , divide the number by two else subtract one from the number
        if(num%2==0){
            return countSteps(num/2 , steps+1);
        }
        System.out.println("hey there");

        return countSteps(num-1,steps+1);

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
