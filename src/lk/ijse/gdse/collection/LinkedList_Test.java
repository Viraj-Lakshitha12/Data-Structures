package lk.ijse.gdse.collection;

import java.util.*;

public class LinkedList_Test {
    public static void main(String[] args) {
     List<Integer> list = new LinkedList<Integer>();
     list.add(1000);
     list.add(200);
     list.add(30);
     list.add(40);
     System.out.println(list);

     list.add(3,100);
     System.out.println(list);

     list.set(4,400);
     System.out.println(list);

     Integer i1 = list.get(2);
     System.out.println(i1);


        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
     System.out.println("\n---------------------------");

     Iterator<Integer> iterator = list.iterator();
     while (iterator.hasNext()){
       System.out.print(iterator.next()+" ");
     }

     List<Integer> list1 = new LinkedList<Integer>();
     list1.addAll(list);
     System.out.println("\nList 1 is : "+list1);
//     list1.removeAll(list);


     System.out.println("After Sorting");

     Collections.sort(list1);
     System.out.println(list1);

    }
}
