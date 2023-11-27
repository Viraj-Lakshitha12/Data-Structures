package lk.ijse.gdse.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Test {
    public static void main(String[] args) {
        java.util.List<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(150);
        list1.add(30);
        list1.add(30);
        list1.add(30);
        list1.add(40);
        System.out.println("30 index is : "+list1.indexOf(30));
        System.out.println(list1.lastIndexOf(30));
        System.out.println("count is : "+list1.stream().count());
        System.out.println("First number : "+list1.stream().findFirst());

        Collections.sort(list1);
        System.out.println("After sort list");
        System.out.println(list1);

        ArrayList <String> arrayList = new ArrayList<String>();

        arrayList.add("kamal");
        arrayList.add("kamal1");
        arrayList.add(2,"kamal2");

        System.out.println(arrayList);

    }
}
