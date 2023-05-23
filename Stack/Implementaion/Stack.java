package Implementaion;

public class Stack {

  public int length = 0;
  public int top = -1;
  private int max = 999;
  int stack[] = new int[max];

  public void push(int data) {
    if (!isFull()) {
      top++;
      stack[top] = data;
    } else {
      System.out.println("Stack is full");
    }
  }

  public int pop() {
    return !isEmpty() ? stack[top--] : -1;
  }

  public boolean isEmpty() {
    return top == -1 ? true : false;
  }

  public boolean isFull() {
    return top == 999 ? true : false;
  }

  public int contains(int data) {
    for (int i = 0; i <= top; i++) {
      if (stack[i] == data) {
        return i;
      }
    }
    return -1;
  }

  public int peek() {
    return isEmpty() ? -1 : stack[top];
  }

  public void clear() {
    top = -1;
  }

  public void display() {
    for (int i = 0; i <= top; i++) {
      System.out.print(stack[i] + " ");
    }
    System.out.println();
  }
}
