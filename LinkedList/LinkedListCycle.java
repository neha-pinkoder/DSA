public class LinkedListCycle {

  public static void main(String[] args) {}

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

  public class Solution {

    public boolean hasCycle(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;

      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
          return true;
        }
      }
      return false;
    }
  }
}
