package pgdp.collections;

public class LinkedStack<T> implements Stack<T>{

    private List<T> next;

    public LinkedStack() {
        next = null;
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
//                "info=" + info +
//                ", next=" + next +
//                '}';
//    }

//    public String toString() {
//        StringBuilder result = new StringBuilder("[");
//        for (List<T> t = next; t != null; t = t.getNext())
//            result.append(", ").append(t.getInfo());
//        return result + "]";
//    }

//    @Override
//    public String toString() {
//        return "LinkedStack{" +
//                "next=" + next +
//                '}';
//    }
}
