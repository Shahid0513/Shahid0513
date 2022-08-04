package dsaproblemsolving;
import java.util.*;

public class Graphdd {
	ArrayList<ArrayList<Integer>> graph;
	int v;
	Graphdd(int nodes)
	{
		v = nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<v; i++)
		{
			graph.add(new ArrayList<Integer>());
			
		}
	}
	void addEdge(int v,int u)
	{
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	void printGraph()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("Node i :");
			for(int x : graph.get(i))
			{
				System.out.println(" -> "+x);
				System.out.println();
			}
		}
	}
}
class Graphdd11
{
		public static void main(String[] args)
		{
			Graphdd g = new Graphdd(4);
			g.addEdge(1, 2);
			g.addEdge(2, 3);
			g.addEdge(3, 4);
			//System.out.println();
			g.printGraph();
		//System.out.println("hi");
		}
	
		
	}

	
