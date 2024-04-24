package Main.LinkedLists;
import Main.MyList;
public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

}
