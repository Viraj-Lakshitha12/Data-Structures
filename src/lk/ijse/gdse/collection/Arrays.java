package lk.ijse.gdse.collection;

public class Arrays {
    public static void main(String[] args) {
        Object[] ob = new Object[5];
        System.out.println(ob.length);
        ob[0]=10;
        ob[1]=10.10;
        ob[2]="Hello";
        System.out.println(java.util.Arrays.toString(ob));


    }
}
