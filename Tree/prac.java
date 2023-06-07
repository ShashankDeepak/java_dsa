/*
              10
            20   30
          40  50
*/

import implementaion.*;
import java.util.Scanner;

public class prac {

  public static void main(String[] args) {
    Tree tree = new Tree(10);
    // tree.head.left = Tree.createNode(20);
    // tree.head.right = Tree.createNode(30);
    // tree.head.left.left = Tree.createNode(40);
    // tree.head.left.right = Tree.createNode(50);
    // tree.preorder(tree.head);
    // System.out.println();
    // tree.inorder(tree.head);
    // System.out.println();
    // tree.postorder(tree.head);
    // tree.levelOrderTraversal(tree.head);

    for (int i = 0; i < 15; i++) {
      Node a = Tree.createNode(i);
      tree.insert(tree.head, a);
    }

    tree.levelOrderTraversal(tree.head);
    // try {
    //   System.out.println(tree.search(tree.head, 29).data);
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }
  }
}
