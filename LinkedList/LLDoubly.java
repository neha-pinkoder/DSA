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

  public void display() {
    Node node = head;
    for (int i = 0; i < size; i++) {
      System.out.print(node.value + " -> ");
      node = node.next;
    }
    System.out.println("END");
  }

  public void printInReverse() {
    Node node = tail;
    System.out.print("END");
    for (int i = 0; i < size; i++) {
      System.out.print(" -> " + node.value);
      node = node.prev;
    }
    node = tail;
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
