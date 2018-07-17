#include <iostream>
#include "helper.cpp"
using namespace std;

int main() {
    
    TestClass emp1;

    emp1.setX(2);
    emp1.setY(4);

    cout << "X: " << emp1.getX() << endl;
    cout << "Y: " << emp1.getY() << endl;

    return 0;
}