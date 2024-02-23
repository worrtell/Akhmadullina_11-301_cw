package sem2.lab_3;
// set - набор уникальных элементов
public class Set<T> {
    final int k = 2;
    Object[] arr;
    int size = 0;

    public Set(int cap) {
        arr = new Object[cap];
    }

    public void newArray() {
        Object[] dst = new Object[size*k];
        System.arraycopy(arr,0,dst,0,arr.length);
        this.arr = dst;
    }

    public Boolean contains(T a) {
        for (int i = 0; i < size; i++) {
            if (a.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(T a){
        int cap = arr.length;
        if (!this.contains(a)) {
            if (size < cap) {
                arr[size] = a;
            } else {
                newArray();
                arr[size] = a;
            }
            ++size;
        }
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        -- size;
        for (int i = index; i < size; i++) {
            arr[i] = arr[i+1];
        }
    }

    public void asList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}