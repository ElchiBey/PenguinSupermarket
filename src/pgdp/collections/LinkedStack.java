package pgdp.collections;

public class LinkedStack<T> implements Stack<T>{

    private final T info;
    private List<T> next;

    public LinkedStack(T info, List<T> next) {
        this.info = info;
        this.next = next;
    }


    public T getInfo() {
        return info;
    }

    public List<T> getNext() {
        return next;
    }

    @Override
    public int size() {
        int result = 1;
        for(List<T> t=next; t!=null; t=t.getNext())
            result++;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return (info==null);
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
//        return info.toString();
//    }


//    @Override
//    public String toString() {
//        return "LinkedStack{" +
//                "info=" + info +
//                ", next=" + next +
//                '}';
//    }
}
