package Functions.Loop_Detection;

import Implementaion.*;
import java.util.HashMap;

public class map_method {

  public static void start() {
    LinkedList list = new LinkedList();

    //Creating a looped linked list
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);

    Node temp = list.head.next.next;
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(5);
    list.head.next.next.next.next.next = new Node(6);
    list.head.next.next.next.next.next.next = new Node(7);
    list.head.next.next.next.next.next.next.next = new Node(8);
    list.head.next.next.next.next.next.next.next.next = temp;
    // int a = 20;
    // Node temp1 = list.head;
    // while (--a != 0) {
    //   System.out.print(temp1.data + " ");
    //   temp1 = temp1.next;
    // }
    System.out.println(checkLoop(list.head));
  }

  //Check if loop exists.
  public static boolean checkLoop(Node head) {
    HashMap<Integer, Boolean> map = new HashMap<>();

    Node temp = head;

    while (temp.next != null) {
      if (map.containsKey(temp.data)) {
        System.out.println(map);
        return true;
      } else {
        map.put(temp.data, true);
      }
      temp = temp.next;
    }
    System.out.println(map);
    return false;
  }
}
