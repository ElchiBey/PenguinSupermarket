package pgdp.collections;

public interface Queue extends DataStructure{
    @Override
    int size();

    @Override
    boolean isEmpty();

    void enqueue();
    void dequeue();
}
