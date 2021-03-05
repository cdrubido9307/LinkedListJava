package linkedlist;

public class Main {
    public static void main(String[] args) {
        Node<Integer> newNode = new NodeImpl<Integer>(4, null, null);
        int val = newNode.getValue();
        System.out.println(val);
    }
}
