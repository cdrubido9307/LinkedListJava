package linkedlist;

public interface Node<E> {
    E getValue();

    void setValue(E value);

    Node getNext();

    Node getPrevious();

    void setNext(Node next);

    void setPrevious(Node previous);

    default boolean hasNext() {
        return (getNext() != null);
    }

    default boolean hasPrevious() {
        return (getPrevious() != null);
    }
}
