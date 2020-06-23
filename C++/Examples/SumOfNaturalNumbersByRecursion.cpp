#include <iostream>
using namespace std;

int main() {
	int n, sum = 0;
	cout << "Enter a number: ";
	cin >> n;
	sum = n * (n + 1) / 2;
	cout << "Sum: " << sum << endl;
	return 0;
}
