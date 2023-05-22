/*
            8 <- 7 <- 6
           ↓         ↑                     
 1 -> 2 -> 3 -> 4 -> 5
In floyd Loop detection we dont need that there is unique elements in the list.

It has two variables fast and slow.

Fast moves 2 steps
Slow moves 1 step

Fast will jump as 1 -> 3 -> 5 -> 7 -> 3 -> 5 ...
Slow will jump as 1 -> 2 -> 3 -> 4 -> 5 ...

Initially both fast and slow will point towards head and then start jumping.

If at any point fast == slow then the loop exists , if fast == null then their is no loop.
 */

package Functions.Loop_Detection;

import Implementaion.*;

public class floyd_loop_detection {

  public static void start() {
    LinkedList list = new LinkedList();

    //Creating a looped linked list
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);

    Node temp = list.head.next.next;
    list.head.next.next.next = new Node(1);
    list.head.next.next.next.next = new Node(5);
    list.head.next.next.next.next.next = new Node(2);
    list.head.next.next.next.next.next.next = new Node(7);
    list.head.next.next.next.next.next.next.next = new Node(8);
    list.head.next.next.next.next.next.next.next.next = temp;

    System.out.println(checkLoop(list.head));
  }

  static boolean checkLoop(Node head) {
    Node fast = head;
    Node slow = head;

    while (fast != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }

    return false;
  }
}
