package pgdp.collections;

import java.util.List;

public interface Queue<T> extends DataStructure{
    void enqueue(T pirveli);
    T dequeue();
}
