
public class Rational {

	private int numerator;
	private int denominator;

	public Rational() {

		numerator = 0;
		denominator = 1;

	}

	public Rational(int numerator, int denominator) {

		this.numerator = numerator;
		this.denominator = denominator;

	}

	public void printRational() {

		System.out.println(this.numerator + "/" + this.denominator);

	}

	public void negate() {

		this.numerator *= -1;

	}

	public void invert() {

		int numerator = this.numerator;

		this.numerator = this.denominator;
		this.denominator = numerator;

	}

	public double toDouble() {

		return (double)(this.numerator) / (double)(this.denominator);

	}

	public Rational reduce() {

		/*int gcdnum = gcf(rational.numerator, rational.numerator);

		int gcddenom = gcf(rational.denominator, rational.denominator);

		if(gcdnum > gcddenom && rational.denominator % gcdnum != 0) {

			gcddenom = gcf(gcdnum, rational.denominator);

		}*/

		int gcd;

		if(Math.abs(this.numerator) >= Math.abs(this.denominator)) {

			gcd = gcf(this.numerator, this.denominator);

		} else {

			gcd = gcf(this.denominator, this.numerator);

		}

		return new Rational(this.numerator / gcd, this.denominator / gcd);


	}

	/*public static int gcd(int num, int denom) {

		int gcdnum = gcf(num, num);
		int gcddenom = gcf(denom, denom);

		if(gcdnum > gcddenom && denom % gcdnum != 0) {

			gcddenom = gcf(gcdnum, denom);

		}

	}*/

	public static int gcf(int number, int gcd) {

		int factor = gcd;

		while(factor >= 1) {

			if(number % factor == 0 && gcd % factor == 0) {

				break;

			}

			factor--;

		}

		return factor;

	}

	public Rational reduceEuclid() {


		int gcd = this.numerator >= this.numerator ?
				gcdEuclid(this.numerator, this.denominator) : gcdEuclid(this.denominator, this.numerator);

		return new Rational(this.numerator / gcd, this.denominator / gcd);


	}

	public static int gcdEuclid(int larger, int smaller) {

		if(smaller != 0) {

			return gcdEuclid(smaller, larger % smaller);

		}

		return larger;

	}

	public Rational add(Rational rational2) {

		Rational sum;

		int numSum = this.numerator * rational2.denominator + rational2.numerator * this.denominator;
		int denomSum = this.denominator * rational2.denominator;

		sum = new Rational(numSum, denomSum);

		return sum.reduce();

	}

	public static void main(String[] args) {

		Rational test = new Rational();
		test.numerator = 1;
		test.denominator = 2;

		test.printRational();

		test.negate();
		test.printRational();

		test.invert();
		test.printRational();

		System.out.println(test.toDouble());

		Rational gcdTest = new Rational(-252, 105);
		gcdTest.reduce().printRational();

		Rational gcdEuclid = new Rational(-1, 3);
		gcdEuclid.reduceEuclid().printRational();

		Rational rational1 = new Rational(1, 6);
		Rational rational2 = new Rational(1, 3);

		rational1.add(rational2).printRational();

	}



}
