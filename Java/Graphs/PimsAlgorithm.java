package Graphs;

import java.util.*;

// Class implementing Prim's Algorithm for Minimum Spanning Tree (MST)
public class PimsAlgorithm
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
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        // Add edges to the graph (undirected graph representation)
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // Nested class to represent a pair of (node, cost) for the priority queue
    public static class Pair implements Comparable<Pair>
    {
        int node; // The current node
        int cost; // Cost associated with the node

        // Constructor to initialize the pair
        public Pair(int n, int c)
        {
            this.node = n;
            this.cost = c;
        }

        // Comparator to sort pairs by cost in ascending order
        @Override
        public int compareTo(Pair p2)
        {
            return this.cost - p2.cost;
        }
    }

    // Implementation of Prim's Algorithm
    public static void primsAlgorithm(ArrayList<Edge> graph[], int V)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Min-heap to pick the smallest edge
        boolean vis[] = new boolean[V]; // Visited array to track visited nodes
        pq.add(new Pair(0, 0)); // Start from node 0 with cost 0

        int mstCost = 0; // Total cost of the Minimum Spanning Tree (MST)

        // Process until the priority queue is empty
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove(); // Extract the pair with the smallest cost
            
            // If the node is not visited
            if(!vis[curr.node])
            {
                vis[curr.node] = true; // Mark the node as visited
                mstCost += curr.cost; // Add the cost to the MST

                // Traverse all adjacent edges of the current node
                for(int i = 0; i < graph[curr.node].size(); i++)
                {
                    Edge e = graph[curr.node].get(i);

                    // If the adjacent node is not visited, add it to the priority queue
                    if(!vis[e.des])
                    {
                        pq.add(new Pair(e.des, e.wt));
                    }
                }
            }
        }
        // Print the total cost of the MST
        System.out.println("min cost of mst = " + mstCost);
    }

    // Main method to test Prim's Algorithm
    public static void main(String[] args)
    {
        int V = 5; // Number of vertices in the graph

        // Create an adjacency list representation of the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph); // Populate the graph with edges
        primsAlgorithm(graph, V); // Find the MST using Prim's Algorithm
    }
}