# working with inputs

name = input("What is your name? ")
age = int(input("Hello {0}, How old are you? ".format(name)))

if age > 18:
    print("This is correct.")
else:
    print("Too young.")
