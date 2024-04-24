import Exceptions.ElementNotFoundException;

public class Main {
    public static void main(String[] args) throws ElementNotFoundException {
        MyArrayList<Integer> arr = new MyArrayList();
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        System.out.println(arr.indexOf(3));
        System.out.println(arr.get(0));
        System.out.println(arr.size());
        System.out.println(arr.exists(1));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.LastIndexOf(arr));
        arr.addFirst(15);
        System.out.println(arr.get(0));
        arr.clear();
        System.out.println(arr.size());

    }
}