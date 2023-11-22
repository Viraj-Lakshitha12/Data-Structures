package lk.ijse.gdse.queue;

public class Queue {
   private int [] elementData;
   private int frontPoint;
   private int rearPoint;

    public Queue(int initialCount) {
       elementData=new int[initialCount];
       frontPoint=-1;
       rearPoint=-1;
    }
    public void enQueue(int data){
        if (frontPoint==-1){
            frontPoint=0;
        }
        elementData[++rearPoint]=data;
    }

    public int deQueue() {
        return elementData[frontPoint++];
    }

    public int peek() {
        return elementData[frontPoint];
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = frontPoint; i <= rearPoint; i++) {
            System.out.print(elementData[i]+" ");
        }
        System.out.println("\b]");
    }

    public int size() {
        return (rearPoint-frontPoint)+1;
    }
}
