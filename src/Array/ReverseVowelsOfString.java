package Array;

public class ReverseVowelsOfString {

    //function to check if the given character is a vowel or not
    static boolean checkVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {
            return true;
        }
        return false;
    }

    //functioon to swap values
    static void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    static String reverseVowels(String s) {

        char[] charArray = s.toCharArray(); // convert to character array so we can get rid of immutability
        int i = 0; // pointer to point first value
        int j = s.length() - 1; // pointer to point second value

        //we will move till i is smaller than j
        while (i < j) {

            //if its not a vowel , we dont need to swap , so we can just move the pointer ahead
            if (!checkVowel(charArray[i])) {
                i++;
            }

            //the same for j pointer
            if (!checkVowel(charArray[j])) {
                j--;
            }

            //if we have a case where i and j both are pointing to a vowel , we need to swap the places
            //after swapping , move i ahead , and j backwards
            if (checkVowel(charArray[i]) && checkVowel(charArray[j])) {
                swap(charArray, i, j);
                i++;
                j--;
            }
        }

        //convert the character array to string to get the answer
        String ans = String.valueOf(charArray);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}
