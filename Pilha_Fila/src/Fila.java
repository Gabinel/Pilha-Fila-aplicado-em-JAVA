public class Fila {

    private Object[] elements;
    private int size;
    private int capacity;
    private int start;
    private int end;

    public Fila(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.start = 0;
        this.end = -1;
    }

    public Object add(Object element) {
        if(size == capacity){
            throw new IllegalStateException("A fila está cheia!");
        }

        end += 1;
        elements[end] = element;
        size++;

        return element;
    }

    public Object remove(){
        if(size == 0) {
            throw new IllegalStateException("A fila está vazia!");
        }

        Object removed = elements[start];
        start += 1;
        size--;

        return removed;
    }

    public Object first() {
        if(size == 0) {
            throw new IllegalStateException("A fila está vazia!");
        }

        return elements[start];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int tamanho() {
        return size;
    }

}