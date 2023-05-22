public class selection {
    public static void main(String[] args) {
        int arr[] = {6,3,2,4,1,5};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int index = minIndex(arr,j,n-1); // index = 2
                int temp = arr[j]; // temp = 3 // j = 1 
                arr[j] = arr[index]; // arr[1] = arr[2] // arr[1] = 2
                arr[index] = temp;//arr[2] = 3
            }
        }

        for(int i : arr)
        System.out.print(i + " ");
    }

    static int minIndex(int arr[], int start, int end){
        int min = arr[start];
        int j = start;
        for(int i = start; i <= end; i++){
            if(arr[i] < min){ 
                min = arr[i];
                j = i;               
            }
        }
        return j;
    }
}

/*
        Time complexity -> O(n2)

        In selection sort the minimum value is taken from the array and swapped with the first elelemt from start
        then second least element is taken and then swapped with second eleemnt from start.
        In this a sorted array and unsorted array is taken.
        
        Sorted part <- | 6 3 2 4 1 5 -> unsorted array
        //The minimum element is 1

        1 | 3 2 4 6 5
        //Min = 2

        1 2 | 3 4 6 5
        //min = 3

        1 2 3 | 4 6 5
        //min = 4

        1 2 3 4 | 6 5
        //min = 5

        1 2 3 4 5 | 6
        //min = 6

        1 2 3 4 5 6 | 
    
When to use Selection Sort?

- When we have insufficient memory
- Easy to implement

When to avoid Selection Sort?
- When time is a concern
*/

/*
    | start -> 6 3 2 4 1 5

    1 start ->  3 2 4 6 5

    1 2 start -> 3 4 6 5

    1 2 3 start -> 4 6 5 

    1 2 3 4 start -> 6 5

    1 2 3 4 5 start -> 6

    1 2 3 4 5 6 start -> 


 */