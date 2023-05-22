class bubble {
    public static void main(String[] args) {

        int arr[] = {5,3,7,2,1};
        int n = arr.length;
        /*In bubble sort we repeatedly sort the items till they are sorted*/
        for(int i = 0; i < n; i++){ //Iterate to the end of the array
            for(int j = 0; j < n-i-1; j++){ // After every iteration the last element is sorted, so next time we have to sort one less time
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr)
        System.out.print(i + " ");
    }

    /*
    arr = 6

    1 4 5 6 3 2 

    1 4 5 6 3 2

    1 4 5 6 3 2
        
    1 4 5 6 3 2

    1 4 5 3 6 2

    1 4 5 3 2 | 6

    1 4 3 5 2 | 6

    1 4 3 2 5 | 6

    1 4 3 2 | 5 6

    1 4 3 2 | 5 6
    
    1 3 4 2 | 5 6

    1 3 2 | 4 5 6

    1 2  | 3 4 5 6

    1 | 2 3 4 5 6

    | 1 2 3 4 5 6



   

Time complexity -> O(n2)

Advantages

The primary advantage of the bubble sort is that it is popular and easy to implement.
In the bubble sort, elements are swapped in place without using additional temporary storage.
The space requirement is at a minimum

Disadvantages

The bubble sort requires n-squared processing steps for every n number of elements to be sorted.
The main disadvantage of the bubble sort is the fact that it does not deal well with a list containing a huge number of items.
The bubble sort is mostly suitable for academic teaching but not for real-life applications.
*/
}