#include <bits/stdc++.h>
using namespace std;

int FindMin(vector<int> &m) {
    int i;
    int n = m.size();
    for (i = 0; i < n; i++) {
        if (i == 0) {
            if (m[i] < m[n - 1] && m[i] < m[1])
                break;
        } else {
            if (m[i] < m[i - 1] && m[i] < m[(i + 1) % n])
            break;
        }
    }
    return m[i % n];
}

int main() {
    
    //initializing vector with the following elements
    vector<int> V = {4, 5, 6, 7, 1, 3, 2};
    
    int n = V.size();

    int mini = 0;

    cout << "The elements of the given vector is : ";
    for (int i = 0; i < n; i++) {
        cout << V[i] << "  ";
    }
    cout << endl;

    mini = FindMin(V);

    cout << "The Minimum element in the given vector is: " << mini << endl;

    return 0;
}