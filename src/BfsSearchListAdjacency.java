import java.util.LinkedList;
import java.util.Scanner;

public class BfsSearchListAdjacency {
    private final LinkedList<Integer>[] adj;
    Scanner scanner = new Scanner(System.in);
    private final int numberOfNode = scanner.nextInt();

    BfsSearchListAdjacency() {

        adj = new LinkedList[numberOfNode];
        for (int i = 0; i < numberOfNode; ++i)
            adj[i] = new LinkedList();
    }

    public static void main(String[] args) {
        BfsSearchListAdjacency bfsSearchListAdjacency = new BfsSearchListAdjacency();
        bfsSearchListAdjacency.addEdge(0, 1);
        bfsSearchListAdjacency.addEdge(0, 2);
        bfsSearchListAdjacency.addEdge(1, 2);
        bfsSearchListAdjacency.addEdge(2, 0);
        bfsSearchListAdjacency.addEdge(2, 3);
        bfsSearchListAdjacency.addEdge(3, 3);
        bfsSearchListAdjacency.bfs(1);
    }

    void bfs(int s) {
        boolean[] visited = new boolean[numberOfNode];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.println(s + " ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void addEdge(int node, int adjNode) {
        adj[node].add(adjNode);
    }
}
