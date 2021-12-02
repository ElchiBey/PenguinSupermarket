package pgdp.collections;

import java.util.List;

public interface Queue extends DataStructure{
    @Override
    int size();

    @Override
    boolean isEmpty();

    List enqueue();
    void dequeue();
}
