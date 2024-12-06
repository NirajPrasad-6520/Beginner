package Graphs;

import java.util.ArrayList;

// Class implementing the Bellman-Ford Algorithm for shortest paths
public class BellmanFord
{
    // Nested class to represent an Edge in the graph
    static class Edge
    {
        int src; // Source vertex of the edge
        int des; // Destination vertex of the edge
        int wt;  // Weight of the edge

        // Constructor to initialize an edge
        public Edge(int s, int d, int w)
        {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    // Method to create a graph using an adjacency list
    public static void createGraph(ArrayList<Edge> graph[])
    {
        // Initialize each adjacency list
        for (int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges to the graph (directed graph representation)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    // Implementation of the Bellman-Ford Algorithm
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V)
    {
        int dist[] = new int[V]; // Distance array to store the shortest path estimates

        // Initialize the distance of all vertices from the source
        for (int i = 0; i < V; i++)
        {
            if (i != src)
            {
                dist[i] = Integer.MAX_VALUE; // Set initial distance to infinity for all except the source
            }
        }

        // Relax all edges (V - 1) times
        for (int k = 0; k < V - 1; k++)
        {
            // Traverse all vertices
            for (int i = 0; i < V; i++)
            {
                // Traverse all edges of vertex `i`
                for (int j = 0; j < graph[i].size(); j++)
                {
                    Edge e = graph[i].get(j); // Get the edge
                    int u = e.src;           // Source vertex of the edge
                    int v = e.des;           // Destination vertex of the edge

                    // Relax the edge if a shorter path is found
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v])
                    {
                        dist[v] = dist[u] + e.wt; // Update the distance to vertex `v`
                    }
                }
            }
        }

        // Print the final shortest distances from the source
        for (int i = 0; i < dist.length; i++)
        {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the Bellman-Ford Algorithm
    public static void main(String[] args)
    {
        int V = 5; // Number of vertices in the graph

        // Create an adjacency list representation of the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph); // Populate the graph with edges

        bellmanFord(graph, 0, V); // Find shortest paths from the source vertex (0)
    }
}