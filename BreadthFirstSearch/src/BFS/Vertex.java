package BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
	//data can be generic data type for general purposes
	private int data; 
	private boolean visited;
	private List<Vertex> neighbourList;
	
	public Vertex(int data)
	{
		this.data = data;
		this.neighbourList = new ArrayList<Vertex>(); 
	}
	
	public void addNeighbour(Vertex neighbour)
	{
		this.neighbourList.add(neighbour);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}
	
	@Override
	public String toString() {
		
		return "" + this.data;
	}
}
