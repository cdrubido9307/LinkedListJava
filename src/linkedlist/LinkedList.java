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

    public void add(E element) {
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

    public void insert(int index, E element) {
        if (index > size) {
            validateIndex(index);
        }
        Node current = head;
        int i = 0;
        if (index == 0) {
            if (isEmpty()) {
                add(element);
                return;
            } else {
                Node newNode = new NodeImpl(element, head, null);
                head.setPrevious(newNode);
                head = newNode;
                size++;
                return;
            }
        } else if (index == size) {
            add(element);
            return;
        }

        while (current != null) {
            if (i == (index - 1)) {
                Node temp = current.getNext();
                Node newNode = new NodeImpl(element, temp, current);
                current.getNext().setPrevious(newNode);
                current.setNext(newNode);
                size++;
                return;
            } else {
                current = current.getNext();
                i++;
            }

        }
    }

    public int indexOf(E element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getValue() == element) {
                return index;
            }
            index++;
            current = current.getNext();
        }

        return -1;
    }

    public E getValue(int index) {
        validateIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return (E) current.getValue();
    }

    public void validateIndex(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public String toString() {
        String list = "";
        Node current = head;
        while(current != null) {
            if(current.getNext() == null)
                list+= current.getValue();
            else
                list += current.getValue() + " <--> ";
            current = current.getNext();
        }
        return list;
    }


}
