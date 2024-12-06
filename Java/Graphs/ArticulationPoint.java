package Graphs;
import java.util.*;

// Class to find articulation points in a graph
public class ArticulationPoint
{
    // Static nested class to represent an edge in the graph
    static class Edge
    {
        int src; // Source vertex
        int des; // Destination vertex

        public Edge(int s, int d)
        {
            this.src = s;
            this.des = d;
        }
    }

    // Method to create a graph using adjacency lists
    public static void createGraph(ArrayList<Edge> graph[])
    {
        // Initialize the adjacency list for each vertex
        for (int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges to the graph (bidirectional/undirected graph)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // Depth First Search to find articulation points
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time, boolean ap[])
    {
        // Mark the current node as visited
        vis[curr] = true;

        // Initialize discovery time and low value for the current node
        dt[curr] = low[curr] = ++time;

        // Counter to track the number of child nodes
        int child = 0;

        // Iterate through all neighbors of the current node
        for (int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            int neigh = e.des;

            // Skip the edge that points back to the parent
            if (par == neigh)
                continue;

            // If the neighbor is already visited, update the low value
            else if (vis[neigh])
            {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
            // If the neighbor is not visited, recursively call DFS
            else
            {
                dfs(graph, neigh, curr, dt, low, vis, time, ap);

                // Update the low value of the current node
                low[curr] = Math.min(low[curr], low[neigh]);

                // Check if the current node is an articulation point
                if (dt[curr] <= low[neigh] && par != -1) {
                    ap[curr] = true;
                }

                // Increment the child counter
                child++;
            }
        }

        // Special case for the root node: it's an articulation point if it has more than one child
        if (par == -1 && child > 1)
        {
            ap[curr] = true;
        }
    }

    // Method to find all articulation points in the graph
    public static void getAP(ArrayList<Edge> graph[], int V)
    {
        int dt[] = new int[V]; // Discovery times of vertices
        int low[] = new int[V]; // Lowest points reachable from each vertex
        int time = 0; // Time counter for discovery times
        boolean vis[] = new boolean[V]; // Visited array to track visited nodes
        boolean ap[] = new boolean[V]; // Array to mark articulation points

        // Perform DFS for each unvisited vertex
        for (int i = 0; i < V; i++)
        {
            if (!vis[i])
            {
                dfs(graph, i, -1, dt, low, vis, time, ap);
            }
        }

        // Print all articulation points
        for (int i = 0; i < V; i++)
        {
            if (ap[i])
            {
                System.out.println(i); // Print the index of articulation points
            }
        }
    }

    // Main method
    public static void main(String[] args)
    {
        int V = 5; // Number of vertices in the graph

        // Create an adjacency list representation of the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph); // Build the graph

        // Find and print all articulation points in the graph
        getAP(graph, V);
    }
}