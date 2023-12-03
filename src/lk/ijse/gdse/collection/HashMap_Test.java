package lk.ijse.gdse.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Test {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"kamal");
        hashMap.put(2,"Amal");
        hashMap.put(3,"Amal");

        System.out.println(hashMap); // {1=kamal, 2=Amal, 3=Amal}

        hashMap.put(3,"X");
        System.out.println(hashMap.entrySet()); //[1=kamal, 2=Amal, 3=X]

        System.out.println("2 value is : "+hashMap.get(2)); // 2 value is : Amal

        hashMap.remove(3);
        System.out.println(hashMap); // {1=kamal, 2=Amal}

        System.out.println(hashMap.containsKey(2)); // true
        System.out.println(hashMap.containsKey(5)); // false
        System.out.println(hashMap.containsValue("Amal")); // true
        System.out.println(hashMap.containsValue("AMAL")); // false

        System.out.println(hashMap.isEmpty()); // false

        System.out.println(hashMap.keySet()); // [1, 2]
        System.out.println(hashMap.values()); //[kamal, Amal]


    }

}
