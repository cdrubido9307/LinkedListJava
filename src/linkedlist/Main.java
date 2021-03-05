package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(2);
        list1.add(3);
        list1.add(5);

        list1.insert(3, 1);
        list1.insert(0,10);
        System.out.println(list1.toString());

        list1.insert(5,20);
        list1.insert(4,30);
        System.out.println(list1.toString());

        list1.insert(3,55);
        list1.insert(6,66);
        list1.add(8);
        System.out.println(list1.toString());

        System.out.println(list1.getValue(1));
        System.out.println(list1.getValue(9));
        System.out.println(list1.getValue(4));

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Laritza");
        list2.add("Maikel el 22");
        list2.add("Africa");
        System.out.println(list2.toString());


    }
}
