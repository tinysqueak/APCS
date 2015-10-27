
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

	public static void printRational(Rational rational) {

		System.out.println(rational.numerator + "/" + rational.denominator);

	}

	public static void negate(Rational rational) {

		rational.numerator *= -1;

	}

	public static void invert(Rational rational) {

		int numerator = rational.numerator;

		rational.numerator = rational.denominator;
		rational.denominator = numerator;

	}

	public static double toDouble(Rational rational) {

		return (double)(rational.numerator / rational.denominator);

	}

	public static Rational reduce(Rational rational) {

		/*int gcdnum = gcf(rational.numerator, rational.numerator);

		int gcddenom = gcf(rational.denominator, rational.denominator);

		if(gcdnum > gcddenom && rational.denominator % gcdnum != 0) {

			gcddenom = gcf(gcdnum, rational.denominator);

		}*/

		int gcd;

		if(Math.abs(rational.numerator) >= Math.abs(rational.denominator)) {

			gcd = gcf(rational.numerator, rational.denominator);

		} else {

			gcd = gcf(rational.denominator, rational.numerator);

		}

		return new Rational(rational.numerator / gcd, rational.denominator / gcd);


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

	public static Rational reduceEuclid(Rational rational) {


		int gcd = rational.numerator >= rational.numerator ? 
				gcdEuclid(rational.numerator, rational.denominator) : gcdEuclid(rational.denominator, rational.numerator);

				return new Rational(rational.numerator / gcd, rational.denominator / gcd);


	}
	
	public static int gcdEuclid(int larger, int smaller) {

		if(smaller != 0) {

			return gcdEuclid(smaller, larger % smaller);

		}

		return larger;

	}

	public static Rational add(Rational rational1, Rational rational2) {

		int numSum = rational1.numerator * rational2.denominator + rational2.numerator * rational1.denominator;
		
		int denomSum = rational1.denominator * rational2.denominator;
		
		return reduce(new Rational(numSum, denomSum));

	}

	public static void main(String[] args) {

		Rational test = new Rational();
		test.numerator = 1;
		test.denominator = 2;

		printRational(test);

		negate(test);
		printRational(test);

		invert(test);
		printRational(test);

		System.out.println(toDouble(test));

		Rational gcdTest = new Rational(-252, 105);
		printRational(reduce(gcdTest));

		Rational gcdEuclid = new Rational(-1, 3);
		printRational(reduceEuclid(gcdEuclid));
		
		Rational rational1 = new Rational(1, 6);
		Rational rational2 = new Rational(1, 3);
		
		printRational(add(rational1, rational2));

	}



}
