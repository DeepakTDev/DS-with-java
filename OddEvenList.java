
class ListNode{
    int val;;
    ListNode next;

    ListNode() {
        val = 0;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class OddEvenList {
    public static void main(String args[]) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head = list;
        while(list != null) {
            System.out.println(list.val + " a");
            list = list.next;
        }

        ListNode oddNode= head;
        ListNode evenNode = oddNode.next;
        ListNode evenHead = head.next;

        while (oddNode != null && evenNode != null) {
            if (oddNode.next == evenNode) {
                oddNode.next = evenNode.next;

                if (oddNode.next != null) {
                    oddNode = oddNode.next;
                }
            } else {
                evenNode.next = oddNode.next;
                evenNode = evenNode.next;
            }
        }

        oddNode.next = evenHead;

        while(head != null) {
            System.out.println(head.val + " a");
            head = head.next;
        }
    }

}
