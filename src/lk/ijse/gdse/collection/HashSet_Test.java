package lk.ijse.gdse.collection;

import java.util.HashSet;

public class HashSet_Test {
    public static void main(String[] args) {
//        values added random
//        duplicate values not accept
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(100);
//        hashSet.add(true);
//        hashSet.add(null);
        hashSet.add(100);
        hashSet.add(1100);

        System.out.println("SIze is : "+hashSet.size());
        System.out.println(hashSet);

        hashSet.remove(null);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(null)); //true
        System.out.println(hashSet.contains(400)); //false

    }
}
