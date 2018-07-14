// think like a programmer
// hash program

#include <iostream>
using namespace std;

int getRows() {

    int rows;
    cout << "Enter integer for number of rows: ";
    cin >> rows;

    return rows;
}

int main() {

    int rows;
    rows = getRows();

    for (int x = rows; x >= 1; x--) {
        for(int y = 1; y <= x; y++) {
            cout << "#";
        }
        cout << endl;
    }

    return 0;
}

// END
