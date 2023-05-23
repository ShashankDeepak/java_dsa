/*
 Question --------------------------------

 Give the next smaller number for each element.

 Eg -
 {2 , 1 , 4 , 6 , 5}

 ans = {1 , -1 , -1 , 5 , -1}

 Now smallest element for 2 in 1 , 4 , 6 , 5 -> 1
 Smallest elemtent for 1 in 4 , 6 , 5 -> dosent exists so -1
 Smallest elemtent for 4 in  6 , 5 -> -1
 Smallest elemtent for 6 in  5 -> 5
 Smallest elemtent for 5 in  [] -> -1

 Hence the return array is {1 , -1 , -1 , 5 , -1}
 */

import Implementaion.Stack;

public class next_smaller_element {

  public static void approach1() {
    /*
     In this is method we take a number and look for next smaller element in remaining array.
     If an element is found then put it in the stack.
     Pop the element in the stack and put it in the new array.
     Clear the stack beacuse we only need smallest and stack might contain all the element that is less the given.
     Time complexity = O(n2)
     */
    int arr[] = { 2, 1, 4, 5 };
    int ans[] = new int[arr.length];
    Stack stack = new Stack();

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          stack.push(arr[j]);
        }
      }
      ans[i] = stack.pop();
      stack.clear();
    }

    for (int i : ans) {
      System.out.print(i + " ");
    }
  }

  public static void approach2() {
    /*
     This has better time complexity -> O(n)

     If we travese the list from left to right we have to continuously iterate every time.

     But if we iterate it from right.

     {2 , 1 , 4 , 6 , 5}

     We start from 5,
     There is nothing in the right so its smallest element = -1
     Push the 5 in stack now go to 6, its smallest next smallest is 5 so, 6 -> 5
     dont push 6 as there is already something smaller that it.

     Go to 4 and check if the stack element is smaller, since it is not smaller than 5 pop it put 4 and its value = -1

     4 is not smaller than 1 so pop 4, push 1 and put value = -1

     1 is less than 4 so its value = 1.
     */

    Stack stack = new Stack();
    int arr[] = { 2, 1, 4, 6, 2, 5, 4, 3 };
    int ans[] = new int[arr.length];

    stack.push(arr[arr.length - 1]);
    ans[arr.length - 1] = -1;

    for (int i = arr.length - 2; i >= 0; i--) {
      if (stack.peek() > arr[i]) {
        ans[i] = -1;
        stack.pop();
        stack.push(arr[i]);
      } else {
        ans[i] = stack.peek();
      }
    }

    for (int i : ans) {
      System.out.print(i + " ");
    }
  }
}
