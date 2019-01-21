
class Cheese(object):

    def __init__(self, cheeseNumber):
        self.cheeseNumber = cheeseNumber

    def sayHello(self):
        print("Hello Neighbor!")

myCheese = Cheese(12)
myCheese.sayHello()
