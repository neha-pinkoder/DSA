public class sumOfNumbers {

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummyHead = new ListNode(0);
      ListNode tail = dummyHead;
      int carry = 0;

      while (l1 != null || l2 != null || carry != 0) {
        int digit1 = (l1 != null) ? l1.val : 0;
        int digit2 = (l2 != null) ? l2.val : 0;
        int value = digit1 + digit2 + carry;
        int val_here = value % 10;
        carry = value / 10;

        ListNode node = new ListNode(val_here);
        tail.next = node;
        tail = tail.next;

        l1 = (l1 != null) ? l1.next : null;
        l2 = (l2 != null) ? l2.next : null;
      }
      return dummyHead.next;
    }
  }
}
