package Main.LinkedLists;

public class MyNode<T> {
    T item;
    MyNode<T> next;

    public MyNode(T item) {
        this.item = item;
        next = null;
    }
}
