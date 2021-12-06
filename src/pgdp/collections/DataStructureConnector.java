package pgdp.collections;

public interface DataStructureConnector<T> {
    boolean hasNextElement();
    void addElement(T element);
    T removeNextElement();
}
