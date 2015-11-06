
public class Pascal {
	
	public static void main(String[] args) {
		
		System.out.println(element(5, 3));
		
	}
	
	public static int element(int row, int index) {
		
		if(index == 1 || index == row) {
			
			return 1;
			
		}
		
		return element(row - 1, index - 1) + element(row - 1, index);
		
	}
	
}
