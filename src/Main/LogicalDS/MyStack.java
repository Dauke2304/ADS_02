package Main.LogicalDS;

import Main.MyArrayList;

public class MyStack<T extends Comparable<T>> {
    private MyArrayList<T> stackArr;
    public MyStack(){
        stackArr = new MyArrayList<T>();
    }
    public T push(T item){
        stackArr.addLast(item);
        return item;
    }
    public boolean isEmpty() {
        return stackArr.size() == 0;
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T poppedItem = stackArr.getLast();
        stackArr.removeLast();
        return poppedItem;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArr.getLast();
    }
    public int size() {
        return stackArr.size();
    }
    public void clear() {
        stackArr.clear();
    }

    public void printStack() {
        stackArr.PrintArray();
    }

}
