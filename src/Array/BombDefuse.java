package Array;

import java.util.Arrays;

public class BombDefuse {

    static int[] decrypt(int[] code, int k) {

        int n=code.length;
        int[] result=new int[n];

        //iterate n times
        for(int i=0;i<n;i++){

            //initialise a sum variable , value 0
            int sum=0;

            if(k>0){
                for(int j=1;j<=k;j++){


                    //initialise a temp variable , value i+j
                    int temp=i+j;

                    //if temp>length-1 , take mod and subtract 1 to get the index
                    if(temp > (n-1)){

                        temp= temp % n;

                    }


                    //get the remaining sum
                    sum=sum+code[temp];
                }
            }
            else{
                for(int j=1;j<=(-k);j++){

                    System.out.println(i+" "+j);
                    int temp=n-i-j;

                    temp= ((temp%n) + n )%n;
                    //modules: ((a % b) + b) % b
                    System.out.println("temp: "+temp);


                    sum=sum+code[temp];



                }
            }
            //iterate till k times

            System.out.println("****************");
            //set result as the iterated sum value
            result[i]=sum;

        }

        return result;

    }
    public static void main(String[] args) {
        int[] arr={2,4,9,3};
        int[] ans=decrypt(arr,-2);
        System.out.println(Arrays.toString(ans));
    }
}
