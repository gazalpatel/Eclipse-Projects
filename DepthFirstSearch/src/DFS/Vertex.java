package DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex 
{
	private String name;
	private boolean isVisited;
	private List<Vertex> adjacenciesList;
	private Vertex predecessor;
	
	public Vertex(String name)
	{
		this.name = name;
		this.adjacenciesList = new ArrayList<Vertex>();
	}
	public void addNeighbour(Vertex neighbour)
	{
		this.adjacenciesList.add(neighbour);
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public Vertex getPredecessor() {
		return predecessor;
	}
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}
	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
