package iddfs;

public class Main 
{
	public static void main(String[] args)
	{
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		
		node1.addNeighbour(node2);
		node2.addNeighbour(node3);
		
		Algorithm algorithm = new Algorithm(node1);
		algorithm.runDeepeningSearch(node1);
	}
}

/*
 * 
 * output: for node 1:
 A 
 Node has been found...
 * 
 * output: for node 2:
A 
A B 
 Node has been found...
 * 
 * 
 * 
 * output: for node 3: 
A 
A B 
A B C 
 Node has been found...

 * 
 * 
 */