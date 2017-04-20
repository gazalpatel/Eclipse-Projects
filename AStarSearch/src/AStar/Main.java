package AStar;

import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");
				
		node1.addNeighbour(new Edge(node2, 10));
		//node1.addNeighbour(new Edge(node4, 1));
		node1.addNeighbour(new Edge(node4, 100));
		node2.addNeighbour(new Edge(node3, 10));
		node3.addNeighbour(new Edge(node4, 10));
		
		Algorithm algorithm = new Algorithm();
		algorithm.aStarSearch(node1, node4);
		
		List<Node> path = algorithm.printPath(node4);
		
		System.out.println(path);
	}
}

/*
 * 
 * Input:node1.addNeighbour(new Edge(node2, 10));
		node1.addNeighbour(new Edge(node4, 1));
		node2.addNeighbour(new Edge(node3, 10));
		node3.addNeighbour(new Edge(node4, 10));
 *
 * Output:
 * [A, D]
 * 
 * 
 * Input:node1.addNeighbour(new Edge(node2, 10));
		node1.addNeighbour(new Edge(node4, 100));
		node2.addNeighbour(new Edge(node3, 10));
		node3.addNeighbour(new Edge(node4, 10));
 * 
 * Output:
 * [A, B, C, D]
 * 
 * 
 */
