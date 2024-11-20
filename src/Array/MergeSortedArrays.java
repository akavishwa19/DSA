package Array;

import java.util.Arrays;

public class MergeSortedArrays {

    //not the optimal solution
    static void merge(int[] nums1, int m, int[] nums2, int n) {

        //iterate till the length of n because we need to fill these in the first array
        for(int i=0;i<n;i++){

            System.out.println((m+n)-i-1);
            //fill the elements of nums2 in the first array
            nums1[(m+n)-i-1]=nums2[i];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    //optimal
    static void merge_sorted_optimal(int[] nums1, int m, int[] nums2, int n){

    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
