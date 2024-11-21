package Collection_framework;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //create an arraylist named a of type integer
        ArrayList<Integer> a = new ArrayList<>();

        //add linearly
        a.add(1);
        a.add(2);
        a.add(3);

        //set value at a particular index
        a.set(0,10);

        //get value at a particular index
        System.out.println(a.get(2));

        //print the array list directly
        System.out.println(a);

        //remove at a particular index
        a.remove(0);

        //print the array list directly
        System.out.println(a);

        //add at a particular index , rest other elements get shifted by one step
        a.add(0,99);

        System.out.println(a);




    }
}
