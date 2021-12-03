package pgdp.collections;

public class Main {

    public static  void main(String[] args){
        LinkedStack<Integer> stack = new LinkedStack<Integer>(156,null);
        stack.push(12);
        stack.push(178);
        stack.pop();
        System.out.println(stack.toString());
    }
}
