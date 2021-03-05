package linkedlist;

public class NodeImpl<E> implements Node{
    private E _value;
    private Node _next;
    private Node _previous;

    public NodeImpl (E value, Node next, Node previous) {
        _value = value;
        _next = next;
        _previous = previous;
    }

    public E getValue() {
        return _value;
    }

    public void setValue(Object value) {
        _value = (E) value;
    }

    public Node getNext() {
        if (!hasNext()){
            ;
        }

        return _next;
    }

    public Node getPrevious() {
        if (!hasPrevious()) {
            ;
        }

        return _previous;
    }

    public void setNext(Node next) {
        _next = next;
    }

    public void setPrevious(Node previous) {
        _previous = previous;
    }
}
