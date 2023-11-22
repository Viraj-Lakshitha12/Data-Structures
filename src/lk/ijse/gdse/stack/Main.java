package lk.ijse.gdse.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

//        stack.pop();



//        add element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek =stack.peek();
        System.out.println("peek : "+peek);

        stack.push(40);
        System.out.println("peek : "+stack.peek());

        stack.push(50);
        System.out.println("peek : "+stack.peek());

//        remove element
        System.out.println("pop : "+stack.pop()); // 50
        System.out.println("pop : "+stack.pop()); // 40


        System.out.println("peek : "+stack.peek()); // 30

        stack.push(400);
        stack.push(500);
        stack.push(600);

//        print elements
        stack.printStack();

        System.out.println("Size : "+stack.size());

        stack.push(800);
        System.out.println("Size : "+stack.size());

        stack.clear();
    }
}
