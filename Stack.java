package sem2.lab_3;
public class Stack<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> cur;
    int size = 0;

    public void push(T a) {
        Node<T> temp = new Node<T>(a);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.prev = tail;
            tail.next = temp;
            tail = tail.next;
        }
        ++ size;
    }

    public T pop() {
        Node<T> temp = tail;
        tail = tail.prev;
        -- size;
        return temp.value;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != tail) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

}
