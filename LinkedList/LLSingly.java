public class LLSingly {

  private Node head;
  private Node tail;
  private int size;

  public LLSingly() {
    this.size = 0;
  }

  public void insertAtFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void insertAtLast(int val) {
    if (tail == null) {
      insertAtFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
  }

  public void insertAtIndex(int val, int index) {
    if (index == 0) {
      insertAtFirst(val);
      return;
    }
    if (index == size) {
      insertAtLast(val);
      return;
    }
    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }
    Node node = new Node(val, temp.next);
    temp.next = node;
  }

  //insert with rec
  public void insertAfterRec(int val, int index) {
    head = insertAfterRec(head, index, val);
  }

  private Node insertAfterRec(Node node, int index, int val) {
    if (index == -1) {
      Node newNode = new Node(val, node);
      size++;
      return newNode;
    }
    node.next = insertAfterRec(node.next, index - 1, val);
    return node;
  }

  public void deleteFirst() {
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
  }

  public void deleteLast() {
    if (size <= 1) {
      deleteFirst();
      return;
    }
    tail = get(size - 1);
    tail.next = null;
    size--;
  }

  public void deleteAtIndex(int index) {
    if (index == 0) {
      deleteFirst();
      return;
    }
    if (index == size - 1) {
      deleteLast();
      return;
    }
    Node first = get(index - 1);
    first.next = first.next.next;
    size--;
  }

  public int findAtIndex(int index) {
    if (index == 0) {
      return head.value;
    }
    Node aim = get(index);
    return aim.next.value;
  }

  public int find(int value) {
    Node temp = head;
    if (head.value == value) {
      return 0;
    }
    for (int i = 1; i < size; i++) {
      temp = temp.next;
      if (temp.value == value) {
        return i;
      }
    }
    return -1;
  }

  public void swap(int index1, int index2) {
    Node node1 = get(index1);
    Node node2 = get(index2);
    // Node head = node2
    node1.next = node2.next;
    node2.next = node1;
    if (node1 == head) {
      head = node2;
    } else if (node2 == tail) {
      tail = node1;
    }
  }

  public Node get(int index) {
    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  private class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
