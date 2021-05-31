import java.util.*;

public class JavaLinkedList {

    public static void main(String args[])
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        LinkedList<Integer> ll = new LinkedList<Integer>(arrayList);
        ll.addFirst(5);
        ll.add(3, 9);

        Iterator itr = ll.descendingIterator();
        System.out.println(ll);
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}