package Array;

import java.util.Arrays;

public class ReverseWordsInAString {
    static String reverse(String s){
        String[] str=s.trim().split(" ");
        System.out.println(Arrays.toString(str));
        return Arrays.toString(str);
    }
    public static void main(String[] args) {
        System.out.println((reverse("the sky is blue")));
    }
}
