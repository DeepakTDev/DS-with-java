import java.util.*;

public class BinaryTreeDiameter {
    BinaryNode root;

    BinaryNode prev;

    int diameter = 0;
    public static void main(String args[])
    {
        BinaryTreeDiameter bt = new BinaryTreeDiameter();

        bt.root = new BinaryNode(4);

        bt.root.setLeftNode(new BinaryNode(3));
        bt.root.getLeftNode().setLeftNode(new BinaryNode(1));
        bt.root.setRightNode(new BinaryNode(5));
        bt.root.getRightNode().setRightNode(new BinaryNode(6));

        bt.traverse();
        bt.getDiameter();
        if(bt.isBST()) {
            System.out.println("valid BST");
        } else {
            System.out.println("invalid BST");
        }
    }

    public void getDiameter()
    {
        this.calculateDiameter(root);
        System.out.println("\n diameter" + this.diameter + " ");
    }

    public void traverse()
    {
        inOrderTraverse(this.root);
    }

    private int calculateDiameter(BinaryNode node)
    {
        if (node ==  null) {
            return 0;
        }

        int lh = calculateDiameter(node.getLeftNode());
        int rh = calculateDiameter(node.getRightNode());
        diameter = Math.max(diameter, lh + rh);
        return Math.max(lh, rh) +1;

    }

    public boolean isBST() {
        return this.checkBST(this.root);
    }

    public boolean checkBST(BinaryNode node) {

        if (node != null) {

            if (!checkBST(node.getLeftNode())) {
                return false;
            }

            if (prev != null && prev.getData() >= node.getData()) {
                return  false;
            }

            this.prev = node;

            return checkBST(node.getRightNode());
        }

        return  true;

    }
    private void inOrderTraverse(BinaryNode node)
    {
        if (node == null) {
            return;
        }

        inOrderTraverse(node.getLeftNode());
        System.out.print(node.getData() + " - ");
        inOrderTraverse(node.getRightNode());
    }
}

class BinaryNode
{
    private int data;
    private BinaryNode left;
    private BinaryNode right;

    BinaryNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData()
    {
        return this.data;
    }

    public BinaryNode getLeftNode()
    {
        return this.left;
    }

    public BinaryNode getRightNode()
    {
        return this.right;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public void setLeftNode(BinaryNode node)
    {
        this.left = node;
    }

    public void setRightNode(BinaryNode node)
    {
        this.right = node;
    }
}
