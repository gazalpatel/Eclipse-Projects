package BFS;

public class Main 
{
	public static void main(String[] arg) 
	{
		Algorithm bfsOb = new Algorithm();

		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		Vertex vertex7 = new Vertex(7);
		Vertex vertex8 = new Vertex(8);
		Vertex vertex9 = new Vertex(9);

		/*
		 * vertex1.addNeighbour(vertex2); vertex1.addNeighbour(vertex4);
		 * vertex4.addNeighbour(vertex5); vertex2.addNeighbour(vertex3);
		 */

		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex6);
		vertex1.addNeighbour(vertex4);

		vertex2.addNeighbour(vertex3);
		vertex2.addNeighbour(vertex8);

		vertex6.addNeighbour(vertex9);

		vertex4.addNeighbour(vertex5);
		vertex4.addNeighbour(vertex7);

		bfsOb.bfs(vertex1);
	}
}

/*
 *      (1)
 *      /  \ 
 *    (2)   (4)
 *    /     /
 *   (3)   (5)
 *   
 *   answer:1-2-4-3-5
 *   
 *         (1)
 *      /   |   \ 
 *    (2)  (6)  (4)
 *    / \   /   / \
 *   (3)(8)(9) (5) (7)
 *   
 *   answer:1-2-6-4-3-8-9-5-7
 *   
 */