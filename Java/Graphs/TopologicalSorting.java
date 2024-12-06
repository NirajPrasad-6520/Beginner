package Graphs;
import java.util.*;

public class TopologicalSorting
{
    // Edge class to represent directed edges in the graph
    static class Edge
    {
        int src; // Source vertex
        int des; // Destination vertex

        // Constructor to initialize source and destination of an edge
        public Edge(int s, int d)
        {
            this.src = s;
            this.des = d;
        }
    }

    // Method to create a graph as an adjacency list
    public static void createGraph(ArrayList<Edge> graph[])
    {
        // Initialize each list in the array
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Utility function to perform DFS and populate the stack for topological sort
    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack)
    {
        vis[curr] = true; // Mark the current node as visited

        // Traverse all adjacent vertices of the current node
        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i); // Get the edge

            if(!vis[e.des]) // If the destination node is not visited
            {
                topSortUtil(graph, e.des, vis, stack); // Recursively visit the node
            }
        }

        // Push the current node onto the stack after visiting its neighbors
        stack.push(curr);
    }

    // Method to perform topological sorting on the graph
    public static void topsort(ArrayList<Edge> graph[], int V)
    {
        boolean vis[] = new boolean[V]; // Array to keep track of visited nodes
        Stack<Integer> stack = new Stack<>(); // Stack to store the topological order

        // Perform DFS for each unvisited vertex
        for(int i = 0; i < V; i++)
        {
            if(!vis[i]) // If the node is not visited
            {
                topSortUtil(graph, i, vis, stack); // Call the utility function
            }
        }

        // Pop elements from the stack to get the topological order
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() + " "); // Print the topologically sorted order
        }
    }

    public static void main(String[] args)
    {
        int V = 6; // Number of vertices in the graph

        // Create an array of ArrayLists to represent the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        // Build the graph
        createGraph(graph);

        // Perform topological sorting and print the result
        topsort(graph, V);
    }
}