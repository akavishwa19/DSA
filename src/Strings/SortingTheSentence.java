package Strings;

public class SortingTheSentence {

    static String sortSentence(String s) {

        //split the string and create a string array
        String[] arr=s.split(" ");

        //sort the string array based on the last index value that is provided
        String[] strArr =sortString(arr);

        //remove the number value from the end of the sorted string array
        strArr=removeNumberFromToken(strArr);

        //join the new string array that doesnt contain the number at the end
        String str=String.join(" ",strArr);

        //return the joined string
        return str;
    }

    static String[] sortString(String[] strArr){

        //objective is to sort the string array
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {

                //get the ith and jth value to compare , and swap on the basis of value
                //we need to get the last index of the particular cells string value
                int iThValue = Integer.parseInt(String.valueOf(strArr[i].charAt(strArr[i].length()-1)));
                int jThValue = Integer.parseInt(String.valueOf(strArr[j].charAt(strArr[j].length()-1)));

                //compare and swap
                if(iThValue < jThValue){
                    String temp=strArr[i];
                    strArr[i]=strArr[j];
                    strArr[j]=temp;
                }
            }
        }

        return strArr;
    }

    static String[] removeNumberFromToken(String[] strArr){

        //util to remove the number from the particular index's last index
        for (int i = 0; i < strArr.length; i++) {
            strArr[i]=strArr[i].substring(0,strArr[i].length()-1);
        }
        return strArr;
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
