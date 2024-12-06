package Graphs;
//Bridge is an edge whose deletion increase the graph's number of connected components
import java.util.*;

// Class to find bridges in a graph
public class BridgeInGraph
{

    // Static nested class to represent an edge in the graph
    static class Edge
    {
        int src; // source vertex
        int des; // destination vertex

        public Edge(int s, int d)
        {
            this.src = s;
            this.des = d;
        }
    }

    // Function to create a graph using adjacency lists
    public static void createGraph(ArrayList<Edge> graph[])
    {
        // Initialize each index of the adjacency list
        for (int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    // Depth First Search to find bridges in the graph
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par)
    {
        // Mark the current node as visited
        vis[curr] = true;

        // Set discovery time and low value for the current node
        dt[curr] = low[curr] = ++time;

        // Traverse all neighbors of the current node
        for (int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);

            // Ignore the edge leading back to the parent
            if (e.des == par)
            {
                continue;
            }
            // If the neighbor is not visited, perform DFS on it
            else if (!vis[e.des])
            {
                dfs(graph, e.des, vis, dt, low, time, curr);

                // Update the low value of the current node
                low[curr] = Math.min(low[curr], low[e.des]);

                // Check if the edge is a bridge
                if (dt[curr] < low[e.des])
                {
                    System.out.println("Bridge is: " + curr + "---" + e.des);
                }
            }
            // If the neighbor is already visited, update the low value
            else
            {
                low[curr] = Math.min(low[curr], dt[e.des]);
            }
        }
    }

    // Function to find all bridges in the graph
    public static void getBridge(ArrayList<Edge> graph[], int V)
    {
        int dt[] = new int[V]; // Discovery times of vertices
        int low[] = new int[V]; // Lowest points reachable from each vertex
        int time = 0; // Time counter for discovery times
        boolean vis[] = new boolean[V]; // Visited array

        // Perform DFS for each component of the graph
        for (int i = 0; i < V; i++)
        {
            if (!vis[i])
            {
                dfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }

    // Main function
    public static void main(String[] args)
    {
        int V = 6; // Number of vertices

        // Create a graph with V vertices
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph); // Build the graph

        // Find and print all bridges in the graph
        getBridge(graph, V);
    }
}