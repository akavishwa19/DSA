package Array;

public class PowerOfThree {

    static boolean isPower(int n){

      //base case
      if(n<3.00){
          return false;
      }

      if(n==(double)3){
          return true;
      }

      if(n%3==0){
          return isPower(n/3);
      }

      return false;



    }
    public static void main(String[] args) {
        System.out.println(isPower(30));
    }
}
