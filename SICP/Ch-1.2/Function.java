
public class Function {


	public static void main(String[] args) {

		System.out.println(recursive(10));
		System.out.println(iterativeArray(10));
		System.out.println(iterative(10));

	}

	public static int recursive(int n) {

		if(n < 3) {

			return n;

		}

		return recursive(n - 1) + 2 * recursive(n - 2) + 3 * recursive(n - 3);

	}

	public static int iterativeArray(int n) {

		int[] sequence = new int[n + 1];

		for(int i = 0; i <= n; i++) {

			if(i < 3) {

				sequence[i] = i;

			} else {

				sequence[i] = sequence[i - 1] + 2 * sequence[i - 2] + 3 * sequence[i - 3];

			}

		}

		return sequence[n];


	}

	public static int iterative(int n) {

		int zerothTerm = 0;
		int firstTerm = 1;
		int secondTerm = 2;

		for(int i = 3; i <= n; i++) {

			int temp0 = zerothTerm;
			int temp1 = firstTerm;

			zerothTerm = firstTerm;
			firstTerm = secondTerm;
			secondTerm = secondTerm + 2 * temp1 + 3 * temp0;

		}

		return secondTerm;
	}



}

