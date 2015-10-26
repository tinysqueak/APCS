
public class RationalDemo {

	public static void main(String[] args) {

		Rational asdf = new Rational();

		Rational.printRational(asdf);

	}

}

class Rational {


	private int numerator;
	private int denominator;

	public Rational() {

		numerator = 0;
		denominator = 1;

	}

	public static void printRational(Rational rational) {

		System.out.println(rational.numerator + "/" + rational.denominator);

	}

}
