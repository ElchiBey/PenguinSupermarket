package pgdp.collections;

import java.lang.reflect.Type;

public interface Stack extends DataStructure{
    @Override
    int size();

    @Override
    boolean isEmpty();

    void push();
    void pop();
}
