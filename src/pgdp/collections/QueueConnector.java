package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {

    private LinkedQueue<T> queue;

    public QueueConnector() {
        this.queue = null;
    }

    public QueueConnector(LinkedQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public boolean hasNextElement() {
        return (!queue.isEmpty());
    }

    @Override
    public void addElement(T element) {
        queue.enqueue(element);
    }

    @Override
    public T removeNextElement() {
        return queue.dequeue();
    }
}
