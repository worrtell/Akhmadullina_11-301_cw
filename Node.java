package sem2.lab_3;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> prev;

    public Node(T a) {
        this.value = a;
    }
}
