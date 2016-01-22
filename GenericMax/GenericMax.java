
import java.util.*;

/**
 * 
 * @author William Yang
 */
public class GenericMax<T extends Comparable<T>> extends PriorityQueue<T>{

	public GenericMax(Collection<T> initialCollection) {
		
		addAll(initialCollection);
		
	}
	
	public GenericMax() {
				
	}
	
	public T genericMax() {
		
		return Collections.max(this);

	}
	
	//static version
	public static <T extends Comparable<T>> T staticGenericMax(Collection<T> initialCollection) {
		
		return Collections.max(initialCollection);
		
	}
	
	public static void main(String[] args) {

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
				
		System.out.println("Max Integer: " + staticGenericMax(test));
		
		GenericMax<String> test2 = new GenericMax<String>();
		test2.add("Generic");
		test2.add("Max");
		test2.add("of");
		test2.add("a collection of");
		test2.add("Strings");
		
		System.out.println(test2.genericMax());
	}

}
