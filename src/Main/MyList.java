package Main;

import Main.Exceptions.ElementNotFoundException;

public interface MyList<T> extends Iterable<T> {
    void add(T item); // Adds an item to the list.
    public void add(T item,int index); // Adds an item at a specific index in the list.
    void set(int index, T item); // Sets the item at the specified index in the list.
    void addFirst(T item); // Adds an item to the beginning of the list.
    void addLast(T item); // Adds an item to the end of the list.
    T get(int index); // Retrieves the item at the specified index in the list.
    T getFirst(); // Retrieves the first item in the list.
    T getLast(); // Retrieves the last item in the list.
    void remove(int index); // Removes the item at the specified index from the list.
    void removeFirst(); // Removes the first item from the list.
    void removeLast(); // Removes the last item from the list.
    void sort(); // Sorts the elements in the list.
    int indexOf(Object object) throws ElementNotFoundException; // Returns the index of the first occurrence of the specified object in the list.
    int LastIndexOf(Object object); // Returns the index of the last occurrence of the specified object in the list.
    boolean exists(Object object); // Checks if the specified object exists in the list.
    public Object[] toArray(); // Converts the list to an array.
    void clear(); // Removes all elements from the list.
    int size(); // Returns the number of elements in the list.
}