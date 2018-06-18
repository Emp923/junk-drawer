// messing around with classes

#include <iostream>
using namespace std;

// Base class
class Shape {
    public:
        void setWidth(int w) {
            width = w;
        }
        void setHeight(int h) {
            height = h;
        }

    protected:
        int width;
        int height;
};

// Derived class
class Rectangle: public Shape {
    public:
        int getArea() {
            return (width * height);
        }
};

// Another derived class
class Triangle: public Shape {
    public:
        int getArea() {
            return (width * height) / 2;
        }
};

int main(void) {
    Rectangle Rect;
    Triangle Tri;

    Rect.setWidth(4);
    Rect.setHeight(8);
    Tri.setWidth(4);
    Tri.setHeight(8);

    // Print the area of the object.
    cout << "Total area of rectangle: " << Rect.getArea() << endl;
    cout << "Total area of triangle:  " << Tri.getArea() << endl;

    return 0;
}

// END
