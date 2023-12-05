package lk.ijse.gdse.collection;

import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 20, 30, 40};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < ar.length; i++) {
            hashMap.put(ar[i],i);
        }
        System.out.println(hashMap.keySet().stream().sorted().toList());
    }
}
