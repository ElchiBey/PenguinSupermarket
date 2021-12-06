package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T>{

    private LinkedStack<T> stack;

    public StackConnector() {
        this.stack = null;
    }

    public StackConnector(LinkedStack<T> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNextElement() {
        return (!stack.isEmpty());
    }

    @Override
    public void addElement(T element) {
        stack.push(element);
    }

    @Override
    public T removeNextElement() {
        return stack.pop();
    }
}