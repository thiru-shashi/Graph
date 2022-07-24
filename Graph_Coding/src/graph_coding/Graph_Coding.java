/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph_coding;
import java.io.*;
import java.util.*;
/**
 *
 * @author Thiru_Shashi
 */
public class Graph_Coding {
 private int vertex;  
    private LinkedList<Integer> adjacency []; 
 
    Graph_Coding(int v)
    {
        vertex = v;
        adjacency  = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adjacency [i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adjacency [v].add(w);
    }
 
    void BFS(int s)
    {
        boolean visited[] = new boolean[vertex];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
 
            
            Iterator<Integer> i = adjacency [s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    public static void main(String args[])
    {
       
        Graph_Coding g = new Graph_Coding(4);
 
        g.addEdge(1, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 2);
        g.addEdge(3, 0);
        g.addEdge(3, 3);
        g.addEdge(4, 3);
 
        System.out.println("BFS (starting from vertex 2)");
 
        g.BFS(2);
    }
    
}
