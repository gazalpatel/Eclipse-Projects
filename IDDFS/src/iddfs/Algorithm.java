package iddfs;

import java.util.Stack;

public class Algorithm 
{

	private Node targetNode;
	private boolean isTargetFound;
	
	public Algorithm(Node targetNode)
	{
		this.targetNode = targetNode;
	}
	
	public void runDeepeningSearch(Node startNode)
	{
		int depth =0;
		
		while(!isTargetFound)
		{
			System.out.println();
			dfs(startNode,depth);
			depth++;
		}
	}

	private void dfs(Node startNode, int depth)
	{
		Stack<Node> stack = new Stack<Node>();
		startNode.setDepthLevel(0);
		stack.push(startNode);
		
		while (!stack.isEmpty())
		{
			Node actualNode = stack.pop();
			System.out.print(actualNode+" ");
			
			if(actualNode.getName().equals(this.targetNode.getName()))
			{
				System.out.println("\n Node has been found...");
				this.isTargetFound = true;
				return;
			}
			if(actualNode.getDepthLevel() >= depth)
			{
				continue;
			}
			for(Node node: actualNode.getAdjacenciesList())
			{
				node.setDepthLevel(actualNode.getDepthLevel()+1);
				stack.push(node);
			}
		}
	}
}
