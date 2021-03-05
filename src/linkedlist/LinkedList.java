package linkedlist;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList () {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return this.size ==0;
    }

    public int getSize() {
        return this.size;
    }

    public void insert(E element) {
        Node newNode = new NodeImpl(element, null, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            size++;
        }
    }

    public String toString() {
        String list = "";
        Node current = head;
        while(current != null) {
            if(current.getNext() == null)
                list+= current.getValue();
            else
                list += current.getValue() + " -> ";
            current = current.getNext();
        }
        return list;
    }


}
