package Strings;

public class ReversePrefixOfWord {

    static String reversePrefix(String word, char ch) {

        //first find the index of ch
        int index=0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }

        //now reverse the portion from start to where the index was found
        //start pointer at zero and end pointer at the index
        int start=0;

        while (start<index){
            word = swap(word,start,index);
            start++;
            index--;
        }

        return word;
    }

    static String swap(String str , int i , int j){

        //convert the string into character array because strings are immutable
        char[] charArray = str.toCharArray();

        //swap
        char temp=charArray[i];
        charArray[i] = charArray[j];
        charArray[j]=temp;

        //create a new string from the character array and return
        return new String(charArray);
    }
    public static void main(String[] args) {
        System.out.println(reversePrefix("xyxzxe",'z'));
    }
}
