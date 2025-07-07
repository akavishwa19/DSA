package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {

    static int singleNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }
            else {
                hashSet.add(nums[i]);
            }
        }

        Iterator<Integer> iterator = hashSet.iterator();
        return iterator.next();
    }
    public static void main(String[] args) {
        int[] arr={3,2,2};
        System.out.println(singleNumber(arr));
    }
}
