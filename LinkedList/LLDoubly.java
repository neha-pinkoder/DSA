public class LLDoubly {

  private Node head;
  private Node tail;
  private int size;

  public LLDoubly() {
    this.size = 0;
  }

  public void insertAtFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if (head != null) {
      head.prev = node;
    }
    head = node;
    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void insertLast(int val) {
    if (head == null) {
      insertAtFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    node.prev = tail;
    tail = node;
    size++;
  }

  public void insertAfter(int val, int afterValue) {
    Node node = new Node(val);
    Node prevNode = head;
    for (int i = 1; i < size; i++) {
      if (prevNode.value == afterValue) {
        break;
      }
      prevNode = prevNode.next;
    }
    node.next = prevNode.next;
    prevNode.next = node;
    node.prev = prevNode;
    node.next.prev = node;
    size++;
  }

  public void display() {
    Node node = head;
    for (int i = 0; i < size; i++) {
      System.out.print(node.value + " -> ");
      node = node.next;
    }
    System.out.println("END");
  }

  public void printInReverse() {
    Node last = tail;
    System.out.print("END");
    for (int i = 0; i < size; i++) {
      System.out.print(" -> " + last.value);
      last = last.prev;
    }
  }

  private class Node {

    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
