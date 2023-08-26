import org.w3c.dom.Node;

public class removeDuplicatesFromSortedList {

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

  public static void main(String[] args) {}

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode temp = head;
    if (head == null) {
      return head;
    }
    while (temp.next != null) {
      if (temp.val == temp.next.val) {
        delete(temp);
      } else {
        temp = temp.next;
      }
    }
    return head;
  }

  static void delete(ListNode temp) {
    temp.next = temp.next.next;
  }
}
