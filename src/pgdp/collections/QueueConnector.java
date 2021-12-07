package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {

    private Queue<T> queue;

    public QueueConnector(LinkedQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public boolean hasNextElement() {
        return (!queue.isEmpty());
    }

    @Override
    public void addElement(T element) {
//        queue = new LinkedQueue<T>();
//        queue.enqueue(element);
    }

    @Override
    public T removeNextElement() {
        return queue.dequeue();
    }

//    @Override
//    public String toString() {
//        return "QueueConnector{" +
//                "queue=" + queue +
//                '}';
//    }
}
