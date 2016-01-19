import java.util.ArrayList;

/**
 * 
 * @author William Yang
 *
 * @param <T>
 */
public class GenericMax<T extends Comparable<T>> extends ArrayList<T>{

	public GenericMax() {
		
		add(null);
		
	}
	
	//public GenericMax

	public T genericMax() {
		
		int finalIndex = size();

		if(get(1).compareTo(get(2)) < 0 || get(1).compareTo(get(3)) < 0) {
			
			
			
		}
		
		return null;

	}
	
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
		
	}
	
	public static void main(String[] args) {

		GenericMax<Integer> asdf = new GenericMax<Integer>();
		
	}

}
