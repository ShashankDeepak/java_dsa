package Functions;

/*
 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> x

 we will have 3 pointers for this.

 prev -> null
 curr -> head
 forward -> head.next
 
     1 -> 2 -> 3 -> 4 -> 5 -> 6 -> x
↑    ↑    ↑
p    c    f

    curr.next = prev

 <- 1   2 -> 3 -> 4 -> 5 -> 6 -> x
↑   ↑   ↑
p   c   f

    prev = curr;

 <- 1   2 -> 3 -> 4 -> 5 -> 6 -> x
    ↑   ↑
    c   f
    ↑ 
    p

    curr = forward;
    forward = forward.next;

 <- 1   2 -> 3 -> 4 -> 5 -> 6 -> x
    ↑   ↑    ↑
    p   c    f

    keep doing this curr !- null
 */
import Implementaion.*;

public class Reverse {

  public static void start() {
    LinkedList list = new LinkedList();
    for (int i = 1; i <= 6; i++) {
      list.add(i);
    }
    System.out.println("Original list");
    list.display();

    Node prev = null;
    Node curr = list.head;
    Node forw = list.head.next;

    while (curr != null) {
      curr.next = prev;
      prev = curr;
      curr = forw;
      if (forw != null) forw = forw.next;
    }
    list.head = prev;
    System.out.println("Reversed List");
    list.display();
  }
}
