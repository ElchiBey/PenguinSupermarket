package pgdp.collections;

public class LinkedStack<T> implements Stack<T> {

    private List<T> next;

    public LinkedStack() {
        next = null;
    }

    public LinkedStack(List<T> next) {
        this.next = next;
    }

    @Override
    public int size() {
        int result = 0;
        for (List<T> t = next; t != null; t = t.getNext())
            result++;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return next == null;
    }

    @Override
    public void push(T bolo) {
        next = new List<T>(bolo, next);
    }

    @Override
    public T pop() {
        if (next == null) return null;
        T result = next.getInfo();
        next = next.getNext();
        return result;
    }
}
