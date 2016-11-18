
/**
 * Exercises 15.1 & 15.2
 * @author William Yang
 *
 */
public class ComplexDemo {

	public static void main(String[] args) {

		Complex c = new Complex(3, 4);
		Complex d = new Complex(3, 4);
		Complex e = new Complex(5, 12);

		System.out.println(c.abs());
		System.out.println(e.abs());

		System.out.println();

		System.out.println(Complex.equals(c, d));
		System.out.println(Complex.equals(c, e));

	}

}

class Complex {

	private int real;
	private int imag;

	public Complex(int real, int imag) {

		this.real = real;
		this.imag = imag;

	}

	public double abs() {

		return Math.sqrt(this.real * this.real + this.imag * this.imag);

	}

	public static boolean equals(Complex a, Complex b) {

		return(a.real == b.real && a.imag == b.imag);

	}

}
