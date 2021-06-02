import java.util.*;

public class IsCousinBinaryTree {
    TreeNode root;

    public static void main(String agrs[]) {
        IsCousinBinaryTree isCousinBinaryTree = new IsCousinBinaryTree();

        isCousinBinaryTree.root = new TreeNode(1);

        isCousinBinaryTree.root.setLeft(new TreeNode(2));
        isCousinBinaryTree.root.setRight(new TreeNode(3));
        isCousinBinaryTree.root.getLeft().setLeft(new TreeNode(4));
        isCousinBinaryTree.root.getRight().setRight(new TreeNode(5));
        isCousinBinaryTree.traverse();
        if (isCousinBinaryTree.isCousin(4, 5)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public void traverse() {
        printInorder(this.root);
    }

    private void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.getLeft());
            System.out.print(node.getData() + " - ");
            printInorder(node.getRight());
        }
    }

    public boolean isCousin(int x, int y) {
        pairInfo p1 = getPairInfo(this.root, x, 0, this.root);
        pairInfo p2 = getPairInfo(this.root, y, 0, this.root);

        if (p1.getDepth() == p2.getDepth() && p1.getParentNode() != p2.getParentNode()) {
            return true;
        }
        return false;
    }

    private pairInfo getPairInfo(TreeNode current, int value,int level, TreeNode parent)
    {
        if (current ==  null) {
            return  null;
        }
        if (value == current.getData()) {
            return new pairInfo(parent, level);
        }

        pairInfo leftInfo = getPairInfo(current.getLeft(), value, level+1, current);

        if (leftInfo != null) {
            return leftInfo;
        }

        return getPairInfo(current.getRight(), value, level+1, current);
    }
}

class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setLeft(TreeNode node) {
        this.left = node;
    }

    public void setRight(TreeNode node) {
        this.right = node;
    }

}
class pairInfo {
    private TreeNode parent;
    private int depth;

    pairInfo(TreeNode node, int depth) {
        this.parent = node;
        this.depth = depth;
    }

    public TreeNode getParentNode() {
        return this.parent;
    }

    public int getDepth() {
        return this.depth;
    }
}