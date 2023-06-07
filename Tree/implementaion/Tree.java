package implementaion;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

  public Node head;

  public Tree(int data) {
    head = new Node(data);
    head.left = null;
    head.right = null;
    StringBuilder sc = new StringBuilder("hello");
    sc.reverse().toString().toCharArray();
  }

  public Tree() {}

  public void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  //Dept first search -> preorder inorder postorder

  public void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public void postorder(Node root) {
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  //Breadth first search -> level order traversal
  public void levelOrderTraversal(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);

    while (!queue.isEmpty()) {
      Node temp = queue.poll();

      if (temp == null) {
        System.out.println();

        if (!queue.isEmpty()) {
          queue.add(null);
        }
      } else {
        System.out.print(temp.data + " ");
        if (temp.left != null) {
          queue.add(temp.left);
        }
        if (temp.right != null) {
          queue.add(temp.right);
        }
      }
    }
  }

  public Node search(Node root, int data) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    Node temp = root;
    while (!queue.isEmpty() && temp != null) {
      temp = queue.poll();
      if (temp.data == data && temp != null) {
        return temp;
      } else if (temp != null) {
        if (temp.right != null) {
          queue.add(temp.right);
        }
        if (temp.left != null) {
          queue.add(temp.left);
        }
      }
    }

    return new Node(-1);
  }

  //insert a node
  public Node insert(Node root, Node node) {
    if (root == null) {
      root = node;
      return root;
    } else {
      if (root.data <= node.data) {
        root.left = insert(root.left, node);
      }
      if (root.data > node.data) {
        root.right = insert(root.right, node);
      }
    }
    return root;
  }

  public static Node createNode(int data) {
    Node newNode = new Node(data);
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}
