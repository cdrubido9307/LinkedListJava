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

    //Removes the first instance of an element in a Linked List
    public boolean remove (E element) throws Exception {
        if (isEmpty()) {
            throw new Exception("Error while removing element - list is Empty!");
        }
        Node current = head;

        if (current.getValue() == element) {
            head = current.getNext();
            head.setPrevious(null);
            size--;
            return true;
        }

        if (tail.getValue() == element) {
            tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return true;
        }

        while(current.getValue() != element) {
            if (current.getNext() == null || current == null) {
                return false;
            }
            current = current.getNext();
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        size--;
        return true;

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
    
    public String reverseToString() {
        String list = "";
        Node current = tail;
        while (current != null) {
            if (current.getPrevious() == null)
                list += current.getValue();
            else
                list += current.getValue() + " <--> ";
            current = current.getPrevious();}
        return list;
        }
}
