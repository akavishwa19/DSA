package Recursion;

import java.util.ArrayList;
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

    static ArrayList<String> generateSubsets(String unprocessed, String processed){

        //if the processed
        if(processed.isEmpty()){
            ArrayList<String> list =new ArrayList<String>();
            list.add(unprocessed);
            System.out.println(list);
            return list;
        }
        //we will have both th recusrion calls , in one case , take in another ignore
        //case for taking
        ArrayList<String> listLeft= generateSubsets(unprocessed+processed.charAt(0),processed.substring(1));
        System.out.println("left list: "+ listLeft);
        //case for ignoring
        ArrayList<String> listRight = generateSubsets(unprocessed,processed.substring(1));

        System.out.println("right list: "+ listRight);

        listLeft.addAll(listRight);
        return listLeft;

    }
    public static void main(String[] args) {
        System.out.println(generateSubsets("","abc"));
    }
}
