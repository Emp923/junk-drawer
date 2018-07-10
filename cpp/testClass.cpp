// This is just a testing area

#include <iostream>
using namespace std;

class Box
{
    private:
        int height;
        int width;
        int length;

    public:
        int getVolume()
        {
            return this->height * this->width * this->length;
        }
        
        void setHeight(int height)
        {
            this->height = height;
        }

        int getHeight()
        {
            return this->height;
        }

        void setWidth(int width)
        {
            this->width = width;
        }

        int getWidth()
        {
            return this->width;
        }

        void setLength(int length)
        {
            this->length = length;
        }

        int getLength()
        {
            return this->length;
        }
        
};

int main()
{
    Box box1;
    Box box2;
    
    box1.setHeight(2);
    box1.setLength(4);
    box1.setWidth(3);

    cout << "Box 1 volume: " << box1.getVolume() << endl;

    box2.setHeight(1);
    box2.setLength(7);
    box2.setWidth(14);

    cout << "Box 2 volume: " << box2.getVolume() << endl;
}

// END
