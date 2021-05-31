import java.util.*;

public class TreeTest {
    private Node root;

    public TreeTest() {
        this.root = null;
    }

    public void add(int data) {
        this.root = new Node(data);
    }

    public Node getRoot() {
        return this.root;
    }

    public void traverseInOrder() {
        this.traverseIn(this.root, 0);
    }

    public void traversePreOrder()
    {
        this.traversePre(this.root);
    }

    public void traversePostOrder() {
        this.traversePost(this.root);
    }

    private void traverseIn(Node n, int i) {
        if (n == null) {
            return;
        }

        traverseIn(n.getLeft(), i+1);
        System.out.print(n.getData()+ "  ");

        if (n.getData() == 5) {
            System.out.println("found at" + i);
        }
        traverseIn(n.getRight(), i+1);
    }

    private void traversePre(Node n) {
        if (n == null) {
            return;
        }

        System.out.print(n.getData()+ " ");
        traversePre(n.getLeft());
        traversePre(n.getRight());
    }

    private void traversePost(Node n)
    {
        if (n == null) {
            return;
        }
        traversePost(n.getRight());
        traversePost(n.getLeft());
        System.out.print(n.getData()+ " ");
    }
    public static void main(String args[]) {
        System.out.println("program for tree");

        TreeTest te = new TreeTest();
        te.add(1);
        te.getRoot().setLeft(new Node(2));
        te.getRoot().setRight(new Node(3));
        te.getRoot().getLeft().setLeft(new Node(4));
        te.getRoot().getLeft().setRight(new Node(5));

        System.out.println("traverse In Order");
        te.traverseInOrder();
        System.out.println();
        System.out.println("Traverse PreOrder ");
        te.traversePreOrder();

        System.out.println();
        System.out.println("Traverse PostOrder ");
        te.traversePostOrder();
    }
}

class Node
{
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return this.data;
    }

    public void setLeft(Node n) {
        this.left = n;
    }

    public void setRight(Node n ) {
        this.right = n;
    }

    public Node getLeft()
    {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
}