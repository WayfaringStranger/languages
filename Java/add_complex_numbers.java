public class ComplexNumber {
	double real, img;

	ComplexNumber(double r, double i) {
		this.real = r;
		this.img = i;
	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber(0, 0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(7, 5);
		ComplexNumber c2 = new ComplexNumber(3, 7);
		ComplexNumber temp = sum(c1, c2);
		System.out.println("Sum is " + temp.real + " + " + temp.img + "i");
	}
}

