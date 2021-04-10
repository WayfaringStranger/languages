#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    cout << "Method 1: Initialize a Vector like an Array" << endl;

    // create and initialize a vector
    vector<int> V1{1, 2, 3, 4};

    // prining the vector
    cout << "The elements of the first vector are: ";
    for (int i : V1) {
        cout << i << " ";
    }
    cout << endl;

    cout << "Method 2: Initializing a Vector from an Array" << endl;

    // creating and initializing an array
    int a[] = {11, 22, 33};

    // calculating number of elements in an array
    int n = sizeof(a) / sizeof(a[0]);

    // creating and initializing a vector with the array elements
    vector<int> V2(a, a + n);

    // prining the vector
    cout << "The elements of the second vector are: ";
    for (int i : V2) {
        cout << i << " ";
    }
    cout << endl;

    cout << "Method 3: Initializing a Vector from another Vector" << endl;

    // creating and initializing the source vector
    vector<int> V3 = {10, 22, 33};

    // creating and initializing a second vector with the elements of the first vector
    vector<int> V4(V3.begin(), V3.end());

    // prining the vector
    cout << "The elements of the third vector are: ";
    for (int i : V4) {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}