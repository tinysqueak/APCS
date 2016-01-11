
import java.util.*;

public class Graph {
	
	HashMap<String, ArrayList<String>> map;
	
	public static void main(String[] args) {
		
		//Create map like on on board
		//A to B and C
		//B to nothing
		//C to A
		
		Graph graph = new Graph();
		graph.map = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> BC = new ArrayList<String>();
		BC.add("B");
		BC.add("C");
		
		ArrayList<String> AList = new ArrayList<String>();
		AList.add("A");
		
		graph.map.put("A", BC);
		graph.map.put("B", null);
		graph.map.put("C", AList);
		
		//What is the set of nodes connected from A
		System.out.println(graph.map.get("A"));
		
	}
	
}
