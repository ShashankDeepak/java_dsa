/*
    CELEBRITY PROBLEM

    In a party a person is a celebrity if all these conditions are true.
        - Celebrity knows no one
        - Everyone knows celebrity
    
    A person would know itself though.

    eg -
       0  1  2
   0 | 0  1  0 |
   1 | 0  0  0 |
   2 | 0  1  0 |

   Lets see [0,1] is 1, therefore 0 knows 1
   1 always knows itself. But dosent know anyone else.(rest all are 0)
   2 only knows 1

   Therefore 1 knows no one (0 or 2) but everyone knows 1.

   1 is the celebrity.

   Write a code to check if a give matrix has a celebrity or not.
*/

public class celebrity_problem {

  public static void main(String[] args) {
    int matrix[][] = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
  }
}
