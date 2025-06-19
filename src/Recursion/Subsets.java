package Recursion;

public class Subsets {

    //objective is to print all the subsets of a string
    static void printSubsets(String unprocessed,String processed){

        //if the processed
        if(processed.isEmpty()){
            System.out.println(unprocessed);
            return;
        }
        //we will have both th recusrion calls , in one case , take in another ignore
        //case for taking
        printSubsets(unprocessed+processed.charAt(0),processed.substring(1));

        //case for ignoring
        printSubsets(unprocessed,processed.substring(1));

    }
    public static void main(String[] args) {
        printSubsets("","abc");
    }
}
