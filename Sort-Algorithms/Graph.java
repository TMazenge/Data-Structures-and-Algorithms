import java.io.*;
import java.util.*; 

public class Graph{
	
	private final int V;
	public Bag<Integer>[] adj;


	public Graph(int V)
   	{
      this.V = V;
      adj = (Bag<Integer>[]) new Bag[V];
      for (int v = 0; v < V; v++)
        adj[v] = new Bag<Integer>();
   	}

   	public void addEdge(int v, int w){
      adj[v].add(w);
      adj[w].add(v);
   }

   public Iterable<Integer> adj(int v)
   {  return adj[v];  }

   public int V() {
   	return V;
   }

   public String toString() {
   		String result = "";
   		for (int v=0; v < this.V; v++) {
   			System.out.println(adj[v]);	
   		}
   		return result;
   }

}