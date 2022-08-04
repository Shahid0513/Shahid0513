package da_3_assement;
import java.util.*;
public class MinSpathAndLength {

	public static void main(String args[])
	{

		int v = 8;


		ArrayList<ArrayList<Integer>> adj =
				new ArrayList<ArrayList<Integer>>(v);
		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<Integer>());
		}


		addEdge(adj, 0, 1);
		addEdge(adj, 0, 3);
		addEdge(adj, 1, 2);
		addEdge(adj, 3, 4);
		addEdge(adj, 3, 7);
		addEdge(adj, 4, 5);
		addEdge(adj, 4, 6);
		addEdge(adj, 4, 7);
		addEdge(adj, 5, 6);
		addEdge(adj, 6, 7);
		int source = 0, dest = 7;
		printShortestDistance(adj, source, dest, v);
	}


	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
	}


	private static void printShortestDistance(
			ArrayList<ArrayList<Integer>> adj,
			int s, int dest, int v)
	{
		int pred[] = new int[v];
		int dist[] = new int[v];
		
		if (BFS(adj, s, dest, v, pred, dist) == false) {
			System.out.println("Given source and destination" +
					"are not connected");
			return;
		}

		// LinkedList to store path
		LinkedList<Integer> path = new LinkedList<Integer>();
		int crawl = dest;
		path.add(crawl);
		while( pred[crawl] != -1) {
			path.add(pred[crawl]);
			crawl = pred[crawl];
		}


		System.out.println("Shortest path length is: " + dist[dest]);


		System.out.println("Path is ::");
		for (int i = path.size() - 1; i >= 0; i--) {
			System.out.print(path.get(i) + " ");
		}
	}


	private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
			int dest, int v, int pred[], int dist[])
	{

		LinkedList<Integer> queue = new LinkedList<Integer>();


		boolean visited[] = new boolean[v];


		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}


		visited[src] = true;
		dist[src] = 0;
		queue.add(src);

		
		while (!queue.isEmpty()) {
			int u = queue.remove();
			for (int i = 0; i < adj.get(u).size(); i++) 
			{
				if (visited[adj.get(u).get(i)] == false) 
				{
					visited[adj.get(u).get(i)] = true;
					dist[adj.get(u).get(i)] = dist[u] + 1;
					pred[adj.get(u).get(i)] = u;
					queue.add(adj.get(u).get(i));


					if (adj.get(u).get(i) == dest)
						return true;
				}
			}
		}
		return false;
	}

	/*
public static List<Integer> bfs(int[][] graph, int V, int sourceVertex){
		
		List<Integer>  visited = new ArrayList<>();
		ArrayDeque<Integer>  adjQueue = new ArrayDeque<>();
		
		adjQueue.addLast(sourceVertex);
		
		while(visited.size() < V && adjQueue.isEmpty() == false) {
			int vertex = adjQueue.removeFirst();
			visited.add(vertex);
			for(int i =0; i<V; i++) {
				if(graph[vertex][i] != 0 && adjQueue.contains(i) == false && visited.contains(i) == false) {
					//there is a edge between vertex and i
					adjQueue.addLast(i);
				}
			}
		}
		
		
		
		return visited;
	}
	
	public static List<Integer>  dfs(int [][] graph, int V, int sourceVertex){
		
		List<Integer> visited = new ArrayList<>();
		Stack<Integer>  adjStack  = new Stack<>();
		
		adjStack.push(sourceVertex);
		
		while(visited.size() < V && adjStack.isEmpty() == false) {
			int vertex = adjStack.pop();
			visited.add(vertex);
			for(int i =0; i<V; i++) {
				if(graph[vertex][i] != 0 && adjStack.contains(i) == false && visited.contains(i) == false) {
					//there is a edge between vertex and i
					adjStack.push(i);
				}
			}
			
			
		}
		
		return visited;
	}
	
	
	public static void main(String[] args) {
		
		int graph[][] = {
				{0,1,1,1,0,0},
				{1,0,0,0,1,0},
				{1,0,0,1,1,0},
				{1,0,1,0,0,1},
				{0,1,1,0,0,0},
				{0,0,0,1,0,0}
		};
		
		int V = 6;
		int sourceVertex = 0;
		
		System.out.println("Breadth first Search....");
		List<Integer> bfsVisited = bfs(graph, V, sourceVertex);
		for (Integer vertex : bfsVisited ) {
			System.out.println(vertex);
		}
		
	/*	System.out.println("Depth first Search....");
		List<Integer> dfsVisited = dfs(graph, V, sourceVertex);
		for (Integer vertex : dfsVisited ) {
			System.out.println(vertex);
		}*/
		
		
	}

