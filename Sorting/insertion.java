public class insertion {
    public static void main(String[] args) {
        
        int arr[] = {6,3,2,4,1,5};
        int n = arr.length;

//2 , 3 , 6 , 4 , 1 , 5

        for(int i = 0; i < n; i++){ // i = 2
            int temp = arr[i], j = i; // temp = 2, j = 0

            while(j > 0 && arr[j - 1] > temp){ 
                arr[j] = arr[j - 1]; // arr[1] = arr[0]
                j--; 
            }
            arr[j] = temp;
        }

        for(int i : arr)
            System.out.print(i + " ");
    }
}

/*
 Time complexity -> O(n2)

 In insertion sort we divide the array in two parts, sorted and unsorted.
 Then we take the first elememt from unsorted array and put it in the correct place in sorted array.

  | 6 , 3 , 2 , 4 , 1 , 5
  
  6 | 3 , 2 , 4 , 1 , 5

  3 6 | 2 , 4 , 1 , 5
  //3 is less than 6

  2 3 6 | 4 , 1 , 5
  //2 is less than 6 and less than 3

  2 3 4 6 | 1 , 5
  //4 is less than 6 and greater than 3

  1 2 3 4 6 | 5
  //1 is less than 2

  1 2 3 4 5 6 |
  //5 is less than 6 and greater than 4


When to use Insertion Sort?
    - When we have insufficient memory
    - Easy to implement
    - When we have continuous inflow of numbers and we want to keep them sorted

When to avoid Insertion Sort?
    - When time is a concern
 */