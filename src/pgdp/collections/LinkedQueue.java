package pgdp.collections;

public class LinkedQueue<T> implements Queue<T> {

    private List<T> first, last;

    public LinkedQueue() {
        first = last = null;
    }

    public LinkedQueue(List<T> first, List<T> last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public int size() {
        int result = 0;
        for (List<T> t = first; t != null; t = t.getNext())
            result++;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void enqueue(T bolo) {
        if (first == null) first = last = new List<T>(bolo);
        else {
            last.setNext(new List<T>(bolo));
            last = last.getNext();
        }
    }

    @Override
    public T dequeue() {
        if (first == null) return null;
        T result = first.getInfo();
        if (last == first) last = null;
        first = first.getNext();
        return result;
    }
}
