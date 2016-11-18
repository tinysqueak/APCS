
public class Exponentiation {

	public static void main(String[] args) {

		System.out.println(exponentiate(2,3));
		System.out.println(forExponentiate(2,3));

	}

	public static int exponentiate(int base, int power) {

		if(power == 1) {

			return base;

		} else {

			return base * exponentiate(base, power - 1);

		}

	}

	public static int forExponentiate(int base, int power) {

		int result = 1;

		for(int i = 0; i < power; i++) {

			result *= base;

		}

		return result;

	}

}
