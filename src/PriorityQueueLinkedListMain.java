public class PriorityQueueLinkedListMain {
  public static void main(String[] args) {
    Node n1= new Node(15,4);
    Node n2 = new Node(10,3);
    Node n3 = new Node(20,3);
    PriorityQueueLinkedList obj = new  PriorityQueueLinkedList();
    obj.enqueue(n1);
    obj.enqueue(n2);
    obj.enqueue(n3);
    obj.display();

  }
}
