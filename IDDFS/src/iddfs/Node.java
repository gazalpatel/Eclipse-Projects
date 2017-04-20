package iddfs;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private String name;
	private int depthLevel = 0;
	private List<Node> adjacenciesList;

	public Node(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<Node>();
	}

	public void addNeighbour(Node node) {
		this.adjacenciesList.add(node);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public List<Node> getAdjacenciesList() {
		return adjacenciesList;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
