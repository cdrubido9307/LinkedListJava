package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.insert(2);
        list1.insert(3);
        list1.insert(5);
        list1.insert(8);
        System.out.println(list1.toString());

        LinkedList<String> list2 = new LinkedList<String>();
        list2.insert("Laritza");
        list2.insert("Maikel el 22");
        list2.insert("Africa");
        System.out.println(list2.toString());


    }
}
