package Graphs;
import java.util.*;

public class KosarajusAlgorithm {
    // Inner class to represent an edge in the graph
    static class Edge {
        int src; // Source vertex of the edge
        int des; // Destination vertex of the edge

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    // Method to create a directed graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize adjacency lists for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges to the graph (example graph)
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    // Helper function to perform topological sorting using DFS
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true; // Mark the current node as visited

        // Recursively visit all unvisited neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.des]) {
                topSort(graph, e.des, vis, s);
            }
        }

        // Push the current node to the stack after visiting all its neighbors
        s.push(curr);
    }

    // Helper function to perform a Depth First Search
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true; // Mark the current node as visited
        System.out.print(curr + " "); // Print the node as part of a strongly connected component

        // Visit all unvisited neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.des]) {
                dfs(graph, e.des, vis);
            }
        }
    }

    // Main function to perform Kosaraju's Algorithm
    public static void KosarajusAlgo(ArrayList<Edge> graph[], int V) {
        Stack<Integer> s = new Stack<>(); // Stack to store the order of vertices

        // Step 1: Perform topological sorting on the graph
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // Step 2: Create a transpose (reverse) of the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false; // Reset visited array for the second DFS
            transpose[i] = new ArrayList<Edge>();
        }

        // Reverse all the edges in the graph
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.des].add(new Edge(e.des, e.src));
            }
        }

        // Step 3: Process nodes in the order defined by the stack and perform DFS
        while (!s.empty()) {
            int curr = s.pop(); // Get the next vertex in the topological order
            if (!vis[curr]) {
                dfs(transpose, curr, vis); // Perform DFS on the transpose graph
                System.out.println(); // Print a new line for each strongly connected component
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int V = 5; // Number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V]; // Create an array of adjacency lists
        createGraph(graph); // Build the graph

        // Perform Kosaraju's Algorithm to find strongly connected components
        KosarajusAlgo(graph, V);
    }
}