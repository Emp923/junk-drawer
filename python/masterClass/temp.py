# my testing ground

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def myFunction(self):
        print("Hello my name is " + self.name)

p1 = Person("Eric", 29)
p1.myFunction()
