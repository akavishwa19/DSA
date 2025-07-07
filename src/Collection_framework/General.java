package Collection_framework;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class General {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("hi");
        list.add("bye");

        System.out.println(list+ " " + list.get(0));

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet);

    }
}
