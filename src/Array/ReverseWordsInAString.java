package Array;

import java.util.Arrays;

public class ReverseWordsInAString {
    static String[] reverse(String s){
        String[] str=s.split(" ");
        return str;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse("the sky is blue")));
    }
}
