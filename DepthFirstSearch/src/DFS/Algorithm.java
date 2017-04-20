package DFS;
//DFS With the help of stack
import java.util.Stack;

public class Algorithm 
{
	private Stack<Vertex> stack;
	
	public Algorithm()
	{
		this.stack = new Stack<Vertex>();
	}
	public void dfs(Vertex root)
	{
		stack.add(root);
		root.setVisited(true);
		
		while(!stack.isEmpty())
		{
			Vertex actualVertex = stack.pop();
			System.out.print(actualVertex+" ");
			for(Vertex v: actualVertex.getAdjacenciesList())
			{
				if( ! v.isVisited())
				{
					v.setVisited(true);
					v.setPredecessor(actualVertex);
					stack.push(v);
				}
			}
		}
	}
}
