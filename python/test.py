#!/usr/bin/python
# testing using classes in python

class TestClass(object):
    def __init__(self, x, y):
        self.x = x
        self.y = y

a = TestClass(4, 5)

print a.x
print a.y
