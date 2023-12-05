package lk.ijse.gdse.collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        int[] ar = {100, 120, 200, 20, 20, 40};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        List<Integer> newList = new LinkedList<>();

        for (int i = 0; i < ar.length; i++) {
            hashMap.put(ar[i],i);
        }
        System.out.println(hashMap.keySet().stream().sorted().toList());

        System.out.println("----------------------------------------------------");




        int[] ar1 = {100, 120, 200, 20, 20, 40};
        HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
        List<Integer> newList1 = new LinkedList<Integer>();

        for (int i = 0; i < ar1.length; i++) {
            if (!hashMap1.containsKey(ar1[i])){
                hashMap1.put(ar1[i],i);
                newList1.add(ar1[i]);
            }
        }
        System.out.println("Hash Map :"+hashMap.keySet().stream().sorted().toList());
        System.out.println("new array list : "+newList1.stream().sorted().toList());
    }
}
