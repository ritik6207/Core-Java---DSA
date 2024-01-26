import java.util.LinkedList;

public class Bfs {
    private final int V;
    private final LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")  public  Bfs(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; ++i)
        {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int u)
    {
        adj[v].add(u);
    }

    public void  bfsTraversal(int s)
    {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty())
        {
            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        Bfs  bfs = new  Bfs(v);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        System.out.println("BFS form vertex 0: ");
        bfs.bfsTraversal(0);
        System.out.println();
        System.out.println("BFS form vertex 1: ");
        bfs.bfsTraversal(1);
        System.out.println();
        System.out.println("BFS form vertex 2: ");
        bfs.bfsTraversal(2);
        System.out.println();
    }
}
