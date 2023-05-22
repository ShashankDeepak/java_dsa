package Implementaion;

public class LinkedList {

  public Node head, tail;
  public int length = 0;

  public LinkedList() {
    tail = head;
  }

  Node createNode(int data) {
    return new Node(data);
  }

  public void add(int data) {
    Node node = createNode(data);

    if (head == null) {
      head = node;
      tail = node;
      length++;
      return;
    } else {
      tail.next = node;
      tail = node;
      length++;
      return;
    }
  }

  public void delete() {
    Node temp = head;

    while (temp.next != tail) {
      temp = temp.next;
    }
    temp.next = null;
    tail = temp;
    length--;
  }

  public void insertAt(int index, int data) {
    Node node = createNode(data);
    Node temp = head;
    while (--index != 0) {
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
    length++;
  }

  public void deleteAt(int index) {
    Node temp1 = head;

    while (--index != 0) {
      temp1 = temp1.next;
    }
    Node temp2 = temp1.next;
    temp1.next = temp1.next.next;
    temp2.next = null;
    index--;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
