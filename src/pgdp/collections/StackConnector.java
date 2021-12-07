package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T>{

    private Stack<T> stack;

    public StackConnector(Stack<T> stack) {
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

    @Override
    public String toString() {
        return "StackConnector{" +
                "stack=" + stack +
                '}';
    }
}