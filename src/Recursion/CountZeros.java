package Recursion;

public class CountZeros {

    static int count(int n,int answer){

        //since we need to count , we need to manage it in the arguments as this will be carried to other function calls
        //idea is just to check if the last digit is zero or not
        //if its zero , just increment the count value , if not , do nothing
        //if the number diminishes , just return the count value
        //if we observe  , we have actually passed a value to the above function call --> its a special example to return value to above calls

        if(n==0){
            return answer;
        }

        if(n%10==0){
            answer++;
        }

        return count(n/10,answer);
    }
    public static void main(String[] args) {
        System.out.println(count(10203,0));
    }
}
