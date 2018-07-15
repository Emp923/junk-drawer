#include <iostream>
using namespace std;

class Employee {
    private:
        int x;
        int y;

    public:
        void setX(int x) {
            this->x = x;
        }

        int getX() {
            return this->x;
        }

        void setY(int y) {
            this->y = y;
        }

        int getY() {
            return this->y;
        }
};