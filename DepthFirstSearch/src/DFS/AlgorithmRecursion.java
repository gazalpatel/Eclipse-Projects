package DFS;

public class AlgorithmRecursion
{
	public void dfs(Vertex vertex)
	{
		System.out.print(vertex + "");
		for(Vertex v: vertex.getAdjacenciesList())
		{
			if(!v.isVisited())
			{
				v.setPredecessor(vertex);
				dfs(v);
			}
		}
	}
}
