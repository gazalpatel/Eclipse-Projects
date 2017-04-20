package DFS;

public class Main
{
	public static void main(String[] args)
	{
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
	
		Vertex vertexF = new Vertex("F");
		Vertex vertexG = new Vertex("G");
		Vertex vertexH = new Vertex("H");
		Vertex vertexI = new Vertex("I");
		Vertex vertexJ = new Vertex("J");
		Vertex vertexK = new Vertex("K");
		Vertex vertexL = new Vertex("L");
		
		vertexA.addNeighbour(vertexB);
		vertexB.addNeighbour(vertexC);
		
		vertexB.addNeighbour(vertexD);
		//vertexB.addNeighbour(vertexE);
		vertexB.addNeighbour(vertexL);
		
		vertexC.addNeighbour(vertexJ);
		
		vertexD.addNeighbour(vertexF);
		vertexD.addNeighbour(vertexG);
		
		vertexJ.addNeighbour(vertexK);
		
		vertexF.addNeighbour(vertexH);
		vertexF.addNeighbour(vertexE);
		
		vertexG.addNeighbour(vertexI);
		
		//Algorithm dfs = new Algorithm();
		AlgorithmRecursion dfs = new AlgorithmRecursion();
		dfs.dfs(vertexA);
		
	}
	
}

/*
 * 
 * 			A
 *		  /	  \
 *		B	   C
 *	   /  \
 *    D		E
 *    
 *    Answer: ABEDC
 *    
 *    
 *    	    A
 *		  /	  \
 *		 B	   C
 *	    /  \   /
 *     D   L  J
 *    /  \    /
 *    F   G  K
 *   / \  /
 *  H   E I
 *
 *	Answer with stack: A B L D G I F E H C J K 
 *  Answer with recursion: ABCJKDFHEGIL
 *
*/