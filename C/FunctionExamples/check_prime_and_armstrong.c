#include <stdio.h>
#include <math.h>

int checkPrimeNumber(int n);
int checkArmstrongNumber(int n);

int main() {
	int n, flag;

	printf("Enter a positive integer: ");
	scanf("%d", &n);

	// Check Prime Number
	flag = checkPrimeNumber(n);
	if (flag == 1)
		printf("%d is a prime number.\n", n);
	else
		printf("%d is not a prime number.\n", n);

	// Check Armstrong Number
	if (flag == 1) 
		printf("%d is an Armstrong number.\n", n);
	else
		printf("%d is not an Armstrong number.\n", n);
	return 0;
}	

// Function to check prime number
int checkPrimeNumber(int n) {
	int i, flag = 1, squareRoot;

	// computing the square root
	squareRoot = sqrt(n);
	for (i = 2; i <= squareRoot; i++) {
		// condition for non-prime number
		if (n % i == 0) {
			flag = 0;
			break;
		}
	}
	return flag;
}

// Function to check Armstrong number
int checkArmstrongNumber(int num) {
	int originalNum, remainder, n = 0, flag;
	double result = 0.0;

	// Store the number of digits of num in n
	for (originalNum = num; originalNum != 0; ++n) {
		originalNum /= 10;
	}
	
	for (originalNum = num; originalNum != 0; originalNum /= 10) {
		remainder = originalNum % 10;

		// Store the sum of the power of individual digits in result
		result += pow(remainder, n);
	}

	// Condition for Armstrong number
	if (round(result) == num)
		flag = 1;
	else 
		flag = 0;
	
	return flag;
}

