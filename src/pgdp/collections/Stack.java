package pgdp.collections;

public interface Stack extends DataStructure{
    @Override
    void size();

    @Override
    void isEmpty();

    void push();
    void pop();
}
