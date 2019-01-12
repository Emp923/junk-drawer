#!/usr/bin/python3

class MyClass(object):

	def __init__(self, x, y):
		self.x = x
		self.y = y

	def sayHello(self):
		print("Hello Neighbor!")

	def addThem(self):
		return self.x + self.y

	def smashThem(self):
		return self.x * self.y

class Main(object):

	def main(self):

		obj1 = MyClass(44, 66)

		obj1.sayHello()

		ans1 = obj1.addThem()
		ans2 = obj1.smashThem()

		print(ans1)
		print(ans2)

Main().main()
