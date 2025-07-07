package Strings;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    static int maxVowels(String s , int k){

        int windowVowelCount=0;

        //get vowels in the window
        for (int i = 0; i < k; i++) {
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                windowVowelCount++;
            }
        }

        //final vowel count
        int vowelCount=windowVowelCount;

        //start from window , move till end
        for (int i = k; i < s.length(); i++) {

            char end_ch=s.charAt(i);
            char start_ch=s.charAt(i-k);

            if(end_ch == 'a' || end_ch == 'e' || end_ch == 'i' || end_ch == 'o' || end_ch == 'u'){
                windowVowelCount++;
            }
            if(start_ch == 'a' || start_ch == 'e' || start_ch == 'i' || start_ch == 'o' || start_ch == 'u'){
                windowVowelCount--;
            }

            vowelCount=Math.max(vowelCount,windowVowelCount);

        }

        return vowelCount;

    }
    public static void main(String[] args) {
        String str="aeiou";
        System.out.println(maxVowels(str,2));
    }
}
