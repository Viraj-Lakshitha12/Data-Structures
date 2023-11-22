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

        if (isFull()){
            grow();
        }
        if (frontPoint==-1){
            frontPoint=0;
        }
        elementData[++rearPoint]=data;
    }

    private void grow() {
        int [] temp = elementData;
        elementData = new int[rearPoint*2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i]=temp[i];
        }
    }

    public int deQueue() {
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
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
<<<<<<< HEAD
    public boolean isEmpty(){
        return frontPoint==-1;
    }

    public boolean isFull(){
        return elementData.length-1==rearPoint;
    }
=======
>>>>>>> f7030bf5c29b53ad81195a8477bfe6ea47c11310

    public int size() {
        return (rearPoint-frontPoint)+1;
    }
}
