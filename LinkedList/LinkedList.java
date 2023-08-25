public class LinkedList {

  public static void main(String[] args) {
    LLDoubly list = new LLDoubly();
    list.insertAtFirst(3);
    list.insertAtFirst(2);
    list.insertAtFirst(1);
    list.insertAtFirst(0);
    list.display();
    list.printInReverse();
    // LLSingly list = new LLSingly();

    // list.insertAtLast(0);
    // list.insertAtLast(1);
    // list.insertAtLast(2);
    // list.insertAtLast(3);
    // list.deleteAtIndex(0);
    // list.insertAtFirst(0);
    // System.out.println(list.findAtIndex(3));
    // System.out.println(list.find(0));
    // list.display();
  }
}
