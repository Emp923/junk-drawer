#!/usr/bin/python
# messing around with classes

# Base class
class Shape(object):
    def __init__(self):
        self
    def setWidth(self, w):
        self.width = w
    def setHeight(self, h):
        self.height = h

# Derived class
class Rectangle(Shape):
    def __init__(self):
        self
    def getArea(self):
        super().width * super().height

# Another derived class
class Triangle(Shape):
    def __init__(self):
        self
    def getArea(self):
        super().width * super().height / 2

Rect = Rectangle
Tri = Triangle

Rect.setWidth(4)
Rect.setHeight(8)
Tri.setWidth(4)
Tri.setHeight(8)

# Print the area of the object
print "Total area of rectangle: " + Rect.getArea()
print "Total area of triangle: " + Tri.getArea()

# END
