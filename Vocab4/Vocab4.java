
import java.util.*;

public class Vocab4 {

	public static void main(String[] args) {

		String string = "This is a string";
		
		System.out.println(string);
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("This");
		stringList.add("is");
		stringList.add("a");
		stringList.add("Collection");
		stringList.add("of");
		stringList.add("Strings");
		
		System.out.println(stringList);
		
		//adjacency list representation of a graph
		ArrayList<String> aNodes = new ArrayList<String>();
		ArrayList<String> bNodes = new ArrayList<String>();
		ArrayList<String> cNodes = new ArrayList<String>();
		
		aNodes.add("B");
		aNodes.add("C");
		
		bNodes.add("A");
		bNodes.add("C");
		
		cNodes.add("A");
		cNodes.add("B");
		
		HashMap<String, ArrayList<String>> adjacencyList = new HashMap<String, ArrayList<String>>();
		adjacencyList.put("A", aNodes);
		adjacencyList.put("B", bNodes);
		adjacencyList.put("C", cNodes);
		
		System.out.println("This is an adjacency list representation of a graph: " + adjacencyList);
		
	}

}
