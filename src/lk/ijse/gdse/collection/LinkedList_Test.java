package lk.ijse.gdse.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Test {
    public static void main(String[] args) {
     List<Integer> list = new LinkedList<Integer>();
     list.add(10);
     list.add(20);
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

    }
}
