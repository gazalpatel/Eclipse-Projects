package AStar;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{

	private String value;
	
	//cost of function f(x) = g(x) + h(x)
	private double gScore;
	//private double hScore;
	private double fScore;
	
	//x and y co-ordinates
	private double x;
	private double y;
	
	//
	private List<Edge> adjacenciesList;
	private Node parentNode;
	
	public Node(String value)
	{
		this.value = value;
		this.adjacenciesList = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge)
	{
		this.adjacenciesList.add(edge);
	}
	
	@Override
	public String toString()
	{
		return this.value;
	}

	public int compareTo(Node otherNode) {
		// TODO Auto-generated method stub
		
		//return 0;
		return Double.compare(this.fScore, otherNode.getfScore());
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public double getgScore() {
		return gScore;
	}

	public void setgScore(double gScore) {
		this.gScore = gScore;
	}

	public double getfScore() {
		return fScore;
	}

	public void setfScore(double fScore) {
		this.fScore = fScore;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}
}
