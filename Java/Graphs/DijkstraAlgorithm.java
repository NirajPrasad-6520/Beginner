package Graphs;
import java.util.*;

public class DijkstraAlgorithm
{
    // Represents an edge in the graph with a source, destination, and weight
    static class Edge
    {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w )
        {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    // Method to create a graph represented as an adjacency list
    public static void createGraph(ArrayList<Edge> graph[])
    {
        // Initialize the adjacency list for each vertex
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }
        
        // Add edges to the graph
        graph[0].add(new Edge(0, 1, 2)); // Edge from vertex 0 to 1 with weight 2
        graph[0].add(new Edge(0, 2, 4)); // Edge from vertex 0 to 2 with weight 4
        
        graph[1].add(new Edge(1, 3, 7)); // Edge from vertex 1 to 3 with weight 7
        graph[1].add(new Edge(1, 2, 1)); // Edge from vertex 1 to 2 with weight 1
        
        graph[2].add(new Edge(2, 4, 3)); // Edge from vertex 2 to 4 with weight 3
        
        graph[3].add(new Edge(3, 5, 1)); // Edge from vertex 3 to 5 with weight 1
        
        graph[4].add(new Edge(4, 3, 2)); // Edge from vertex 4 to 3 with weight 2
        graph[4].add(new Edge(4, 5, 5)); // Edge from vertex 4 to 5 with weight 5
    }
    
    // Helper class to represent a node and its distance for the priority queue
    public static class Pair implements Comparable<Pair>
    {
        int node;
        int dist;
    
        public Pair(int n, int d)
        {
            this.node = n;
            this.dist = d;
        }
    
        @Override
        public int compareTo(Pair p2) // Compare based on distances
        {
            return this.dist - p2.dist; // Ascending order of distances
        }
    }

    // Implementation of Dijkstra's algorithm
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V)
    {
        // Priority Queue to get the node with the smallest distance
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        // Array to store the shortest distance from the source to each node
        int dist[] = new int[V];
        
        // Initialize distances to infinity (or Integer.MAX_VALUE) except for the source
        for(int i = 0; i < V; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        // Array to track visited nodes
        boolean vis[] = new boolean[V];
        
        // Add the source node to the priority queue with distance 0
        pq.add(new Pair(0, 0));
        
        // Process nodes in the priority queue
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove(); // Get the node with the smallest distance
            
            if(!vis[curr.node]) // Process only if the node is not yet visited
            {
                vis[curr.node] = true; // Mark the node as visited
                
                // Traverse all neighbors of the current node
                for(int i = 0; i < graph[curr.node].size(); i++)
                {
                    Edge e = graph[curr.node].get(i); // Get the edge
                    int u = e.src; // Source node
                    int v = e.des; // Destination node
                    
                    // Relax the edge if a shorter path is found
                    if(dist[u] + e.wt < dist[v])
                    {
                        dist[v] = dist[u] + e.wt; // Update the distance
                        pq.add(new Pair(v, dist[v])); // Add the updated node to the priority queue
                    }
                }
            }
        }

        // Print the shortest distances from the source to all nodes
        for(int i = 0; i < V; i++)
        {
            System.out.print(dist[i] + " "); // Print distances
        }
        System.out.println(); // Newline after printing distances
    }
    public static void main(String[] args)
    {
        int V = 6; // Number of vertices in the graph

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V]; // Adjacency list representation
        createGraph(graph); // Create the graph

        dijkstra(graph, 0, V); // Run Dijkstra's algorithm from source node 0
    }
}