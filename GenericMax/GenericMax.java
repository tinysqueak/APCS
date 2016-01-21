
import java.util.*;

/**
 * 
 * @author William Yang
 *
 * @param <T>
 */
public class GenericMax<T extends Comparable<T>> extends PriorityQueue<T>{

	public GenericMax(Collection<T> initialCollection) {
		
		addAll(initialCollection);
		
	}
	
	public GenericMax() {
		
		//add(null);
		
	}
	
	//public GenericMax
	
	public T genericMax() {
		
		return Collections.max(this);

	}
	
	//static version
	public static <T extends Comparable<T>> T staticGenericMax(Collection<T> initialCollection) {
		
		return Collections.max(initialCollection);
		
	}
	
	/*
	@Override
	public boolean add(T element) {
		
		//add(element);
		
		for(int index = size() - 1; index > 1; index /= 2) {
			
			
			
		}
		
		super.add(element);
		
		return true;
		
	}
	
	private void swap(int index1, int index2) {
		
		T temp = get(index1);
		set(index1, get(index2));
		set(index2, temp);
		
	}*/
	
	public static void main(String[] args) {

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
				
		
		System.out.println("New Max: " + staticGenericMax(test));
		
		GenericMax<Integer> asdf2 = new GenericMax<Integer>(test);
		System.out.println(Collections.max(asdf2));
		
		GenericMax<Integer> asdf = new GenericMax<Integer>();
		asdf.add(1);
		asdf.add(2);
		System.out.println(Collections.max(asdf));
		
	}

}
