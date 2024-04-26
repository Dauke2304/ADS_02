package Main.LogicalDS;

import Main.LinkedLists.MyLinkedList;

public class MyQueue<T extends Comparable<T>> {
    private MyLinkedList<T> myQueue;

    public MyQueue(){
        myQueue = new MyLinkedList<>();
    }
    public T enqueue(T item){
        myQueue.addLast(item);
        return item;
    }
    public boolean isEmpty() {
        return myQueue.size() == 0;
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T poppedItem = myQueue.getFirst();
        myQueue.removeFirst();
        return poppedItem;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return myQueue.getFirst();
    }
    public int size() {
        return myQueue.size();
    }
    public void clear() {
        myQueue.clear();
    }
    public void printQueue() {
        myQueue.PrintLinkedList();
    }

}
