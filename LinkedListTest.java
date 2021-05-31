import java.util.*;

public class LinkedListTest {
    private Node head;

    public void addAtFirst(int data)
    {
        Node node = new Node(data);
        node.setNext(this.head);

        this.head = node;
    }

    public int getSize()
    {
        int size = 0;

        Node node = this.head;

        while(node != null) {
            size++;
            node = node.getNext();
        }

        return size;

    }

    public Node getAt(int index)
    {
        Node node = this.head;
        int count = 0;
        while(node != null) {
            if (index == count) {
                return node;
            }
            count++;

            if (node.getNext() == null) {
                return node;
            }
            node = node.getNext();
        }
        return node;
    }

    public void removeAt(int index)
    {
        Node node;
        if (index <= 0) {
            this.head = this.head.getNext();
        } else {
            node = getAt(index -1);
            if (node.getNext() != null) {
                node.setNext(node.getNext().getNext());
            }
        }
    }

    public void insertAt(int data, int index)
    {
        if (index <=0) {
            addAtFirst(data);
            return;
        }

        Node prev = getAt(index -1);
        Node node = new Node(data);

        if (prev != null) {
            node.setNext(prev.getNext());
            prev.setNext(node);
        }

    }

    public Node getMid()
    {
        Node slow = this.head;
        Node fast = this.head;

        while(fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast  =fast.getNext().getNext();
        }

        return slow;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node node = this.head;
        while(node != null){
            sb.append(node).append(" - ");
            node = node.getNext();
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        LinkedListTest ll =  new LinkedListTest();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);
        ll.addAtFirst(6);
        ll.addAtFirst(7);
        ll.addAtFirst(8);
        System.out.println(ll);
        System.out.println("removing at 5");
        ll.removeAt(5);
        System.out.println(ll);
        System.out.println("adding at 5");
        ll.insertAt(13, 5);
        ll.insertAt(13, 5);
        ll.insertAt(13, 5);
        System.out.println(ll);
        System.out.println("finding mid");
        System.out.println(ll.getMid().getData());

    }

}

class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return this.data;
    }

    public void setNext(Node node)
    {
        this.next = node;
    }

    public Node getNext()
    {
        return this.next;
    }

    @Override
    public String toString() {
        return this.data + "";
    }
}