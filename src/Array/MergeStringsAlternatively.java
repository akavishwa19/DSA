package Array;

public class MergeStringsAlternatively {

    static String merge(String a, String b){

        //create a string builder instance to create the sting to be returned
        StringBuilder str=new StringBuilder();

        //2 pointer variables to traverse the strings
        int i=0;
        int j=0;

        //move till any one of the strings ends
        while (i!=a.length() && j!=b.length()){

            //with each iteration , add the characters in our answer string
            str.append(a.charAt(i));
            str.append(b.charAt(j));
            i++;
            j++;
        }

        //for the left over string , just take the substring from the respective pointer and append in the answer string
        if(i<a.length()){
            str.append(a.substring(i));
        }
        if(j<b.length()){
            str.append(b.substring(j));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(merge("abc","p"));
    }
}
