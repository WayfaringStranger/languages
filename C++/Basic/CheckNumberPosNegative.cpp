#include <iostream>
using namespace std;

int main() {
    int num;

    cout << "Enter any non-zero number to be checked: ";
    cin >> num;

    if (num > 0) {
        cout << "Number is Positive.";
    } else {
        cout << "Number is Negative.";
    }

    return 0;
}