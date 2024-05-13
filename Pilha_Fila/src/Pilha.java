public class Pilha {

    private Object[] elements;
    private int size;
    private int capacity;
    private int top;

    public Pilha(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
        this.size = 0;
    }

    public Object add(Object element) {
        if(size == capacity) {
            throw new IllegalStateException("A pilha está cheia");
        }

        top++;
        elements[top] = element;
        size++;

        return element;
    }

    public Object pop() {
        if(size == 0) {
            throw new IllegalStateException("A pilha está vazia!");
        }

        Object removed = elements[top];
        top--;
        size--;

        return removed;
    }

    public Object top() {
        return elements[top];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}