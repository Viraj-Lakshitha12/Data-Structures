package lk.ijse.gdse.stack;

import java.util.Arrays;

public class Stack {
    int [] elementData;
    int top;

    public Stack(int initialCount) {
        elementData=new int[initialCount];
        top=-1;
    }

    public void push(int data) {
        if (isFull()){
//            System.out.println("Stack is full ");
            grow();
        }
        elementData[++top]=data;
    }

    private void grow() {
        int [] temp = elementData;

        elementData=new int[elementData.length*2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i]=temp[i];
        }
    }

    public int peek() {
        return elementData[top];
    }

    public int pop() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return elementData[top--];
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i]+" ");
        }
        System.out.println("\b]");

    }

    public boolean isFull(){
        return top == elementData.length - 1;
    }

    public boolean isEmpty() {
        return top==-1;
    }


    public int  size() {
        return top+1;
    }

    public void clear() {
        top=-1;
    }
}
