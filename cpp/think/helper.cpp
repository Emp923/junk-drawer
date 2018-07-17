#include <iostream>
using namespace std;

class TestClass {
    private:
        int x;
        int y;
        static int count = 0;

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

        TestClass() {
            count++;
        }

        int getCount() {
            return count;
        }
};