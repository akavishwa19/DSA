package Array;

import java.util.Arrays;

public class IsAnagram {

    static boolean isAnagram(String s, String t) {

        //if lengths are unequal , simply return false
        if(s.length()!=t.length()){
            return false;
        }

        //convert both of them to an array of characters so that we can compare them
        char[] s_array=s.toCharArray();
        char[] t_array=t.toCharArray();

        //sort both
        Arrays.sort(s_array);
        Arrays.sort(t_array);

        //they should be the same if they are anagram after sorting
        if(Arrays.equals(s_array,t_array)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("test","sett"));
    }
}
