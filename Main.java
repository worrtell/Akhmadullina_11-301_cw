package sem2.lab_3;

public class Main {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        a.push("Hello");
        a.push("world");
        a.push(".");
        a.push("?");
        a.print();
        a.pop();
        a.print();

        Set<Integer> b = new Set<>(10);
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(1);
        b.asList();
        try {
            b.delete(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("this index doesn't exist!");
        }
        b.asList();
        System.out.println(b.contains(8));
    }
}
