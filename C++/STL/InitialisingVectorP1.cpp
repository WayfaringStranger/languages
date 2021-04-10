#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    cout << "Method 1: Using push_back() method" << endl;

    // creating an empty vector
    vector<int> V1;

    // inserting elements into the vector
    V1.push_back(1);
    V1.push_back(2);
    V1.push_back(3);

    // printing the vector 
    cout << "The elements of the first vector are: ";
    for (int i : V1) {
        cout << i << " ";
    }
    
    cout << endl;

    cout << "Method 2: Initializing all the elements with a specific value" << endl;

    // create a vector of size 5 with all values initialized to 10
    vector<int> V2(5, 7);

    // printing the vector
    cout << "The elements of the second vector are: ";
    for (int i : V2) {
        cout << i << " ";
    }

    return 0;
}