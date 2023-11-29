package lk.ijse.gdse.collection;

import java.util.*;
import java.util.Arrays;

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

        list1.sort(Collections.reverseOrder());
        System.out.println("After Reverse sort list");
        System.out.println(list1);

        ArrayList <String> arrayList = new ArrayList<String>();

        arrayList.add("kamal");
        arrayList.add("kamal1");
        arrayList.add(2,"kamal2");

        System.out.println(arrayList);

        String [] arr = {"1","2","3","4"};
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("arr coty to arrayList : "+arrayList1);


    }
}
