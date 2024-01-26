public class InsertionHeap {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static void heapify(int[] arr, int n, int i)
    {
//        int i = 2 * parent + 1;
        //find Parent
        int parent = (i - 1) / 2;
        if(arr[parent] > 0)
        {
            /*
             check if the current node is greater than the root node, if yes then swap and call heapify
            * */
            if (arr[i] > arr[parent])
            {
                swap(arr, i, parent);
                //recursively call heapify for the parent node
                heapify(arr, n, parent);
            }
        }
    }

    public static int insert(int[] arr, int n, int value)
    {
        //increase the size of the heap
        n++;

        //insert the element at the end of the heap
        arr[n - 1] = value;

//        up heapity
        heapify(arr, n, n - 1);

        //return size of the heap
        return n;
    }
    public static void printArray(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Maximum size of the heap
        int MAX = 100;
        int[] arr = new int[MAX];

        //initialize values
        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 50;
        arr[4] = 55;
        
        //take the current size of the array
        int n = 5;

        int value = 80;
        System.out.println("Before insert operation, elements are : ");
        printArray(arr, n);

        n = insert(arr, n, value);

        System.out.println("Total elements int the heap : " + n);
        System.out.println("After insert operation, elements are : ");
        printArray(arr, n);
    }
}
