package lk.ijse.gdse.collection;

public class ArrayList {
    public static void main(String[] args) {
        java.util.List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(30);
        list1.add(30);
        System.out.println(list1.indexOf(30));
        System.out.println(list1.lastIndexOf(30));
        System.out.println("count is : "+list1.stream().count());
        System.out.println("First number : "+list1.stream().findFirst());

    }
}
