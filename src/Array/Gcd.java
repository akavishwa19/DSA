package Array;

public class Gcd {

    static int gcd(int m , int n){
        int gcd=1;

        int small=Math.min(m,n);

        for(int i=2;i<=small;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }


        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcd(48,180));
    }
}
