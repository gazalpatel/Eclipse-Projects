package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Algorithm 
{

	public void bfs(Vertex root)
	{
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex + "-");
			
			for(Vertex v : actualVertex.getNeighbourList() )
			{
				if(!v.isVisited())
				{
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
