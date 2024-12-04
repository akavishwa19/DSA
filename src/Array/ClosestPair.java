package Array;

public class ClosestPair {

    static void closest(int[] a,int[] b,int x){

        int closest=Integer.MAX_VALUE;
        int m=0;
        int n=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(Math.abs(a[i]+b[j]-x)<closest){
                    closest=Math.abs((a[i]+b[j]-x));
                    m=a[i];
                    n=b[j];
                }
            }
        }
        System.out.println(m+","+n);
    }

    static void closest_pointer(int[] a,int[] b,int x){

        int closest=Integer.MAX_VALUE;
        int m=0;
        int n=0;

        int i=0;
        int j=0;



        System.out.println(m+","+n);
    }
    public static void main(String[] args) {
        closest(new int[]{-1, 4, 5, 7},new int[]{10, 20, 30, 40},40);
    }
}
