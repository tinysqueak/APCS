
public class Function {

	
	public static void main(String[] args) {
		
		System.out.println(recursive(3));
		
	}
	
	public static int recursive(int n) {
		
		if(n < 3) {
			
			return n;
			
		}
		
		return recursive(n - 1) + 2 * recursive(n - 2) + 3 * recursive(n - 3);
		
	}
	
	public static int iterative(int first, int second, int third, int n) {
		
		if(n < 3) {
			
			return n;
			
		}
		
		
		
	}
	
	
}

