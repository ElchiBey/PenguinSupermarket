package pgdp.collections;

public class LinkedStack<T> implements Stack<T>{

    private List<T> next;
    private final T info;

    public LinkedStack(T info) {
        this.info = info;
        next = null;
    }

    public List<T> getNext() {
        return next;
    }

    @Override
    public int size() {
        int result = 0;
        for(List<T> t=next; t!=null; t=t.getNext())
            result++;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return (next==null);
    }

    @Override
    public void push(T bolo) {
        next = new List<T>(bolo,next);
    }

    @Override
    public T pop() {
        T result = next.getInfo();
        next = next.getNext();
        return result;
    }

//    public String toString(){
//        return next.toString();
//    }


//    @Override
//    public String toString() {
//        return "LinkedStack{" +
//                "next=" + next +
//                '}';
//    }
}
