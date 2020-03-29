#include <stdio.h>
#include <math.h>

/* This numerical integration assumes all area is positive. */

#define PI 3.14159
double num_int (double a, double b, double f(double), unsigned n) {
	if (a == b) return 0.0;
	if (n == 0) n = 1;	/* avoid division by zero */
	double h = (b - a) / n;
	double sum = 0.0;
	for (unsigned k = 0; k < n; ++k)
		sum += h * fabs(f(a + k * h));
	return sum;
}

int main(void) {
	printf("fabs(+3) = %f\n", fabs(+3.0));
	printf("fabs(-3) = %f\n", fabs(-3.0));
	// special values
	printf("fabs(-0) = %f\n", fabs(-0.0));
	printf("fabs(-Inf) = %f\n", fabs(-INFINITY));

	printf("%f\n", num_int(0.0, 2 * PI, sin, 100000));
}

