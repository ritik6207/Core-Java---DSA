package RevisionHeap;

public class HeapImplementation {
    static int n = 0;
    static int[] heap = new int[100];

    public static void swap(int a, int b)
    {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    public static void insert(int x)
    {
        n++;
        //insert element at last position maintains CBT(Complete Binary Tree)
        heap[n - 1] = x;
        int i = n - 1;

        //parent = (i - 1) / 2
        //if parent is smaller, than swap
        while (i > 0 && heap[(i - 1) /2] < heap[i])
        {
            swap((i - 1) / 2, i);
            i = (i - 1) / 2;
        }
    }

    public static void printArray()
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static int delete()
    {
        int deleted = heap[0];

        //replace with last element - 0 with n - 1
        heap[0] = heap[n - 1];

        //reduce the size
        n--;
        int i = 0;
        while (i < (n - 1) / 2)
        {
            if (heap[2*i + 1] > heap[i] || heap[2 * i + 2] > heap[i])
            {
                int maximum = (heap[2*i + 1] > heap[2 * i + 2]) ? 2*i + 1 : 2 * i + 2;
                swap(i, maximum);
                i = maximum;
            }
        }
        return deleted;
    }
    public static void main(String[] args) {
        insert(50);
        insert(30);
        insert(40);
        insert(10);
        insert(5);
        insert(20);
        insert(30);
        printArray();
        System.out.println();
        insert(60);
        printArray();
        System.out.println();
        delete();
        printArray();

    }
}
