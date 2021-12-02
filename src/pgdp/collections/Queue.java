package pgdp.collections;

public interface Queue extends DataStructure{
    @Override
    void size();

    @Override
    void isEmpty();

    void enqueue();
    void dequeue();
}
