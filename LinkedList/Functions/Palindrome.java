package Functions;

import Implementaion.LinkedList;
import Implementaion.Node;

/*
 1 -> 2 -> 2 -> 1

 First reach the middle of the list, reverse the list in front of it
 Now comapre the forward and reversed list

 1 -> 2 <- 2 <- 1
 ↑              ↑ 
 t              p

 
 */
public class Palindrome {

  public static void start() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add(2);

    list.add(1);

    Node fast = list.head;
    Node slow = list.head;
    boolean isPalindrome = true;

    while (fast != null) {
      if (fast.next == null) {
        break;
      }
      fast = fast.next.next;
      slow = slow.next;
    }

    Node prev = slow;
    Node curr = slow.next;
    Node forward = slow.next.next;

    while (curr != null) {
      curr.next = prev;
      prev = curr;
      curr = forward;
      if (forward != null) forward = forward.next;
    }

    Node temp = list.head;

    // list.display(prev);

    while (true) {
      if (prev.data != temp.data) {
        isPalindrome = false;
        break;
      }
      //   System.out.println(temp.data);
      prev = prev.next;

      temp = temp.next;

      if (prev.next == temp) {
        break;
      }
    }

    if (isPalindrome) {
      System.out.println("Is palindrome");
    } else {
      System.out.println("Not palindrome");
    }
  }
}
