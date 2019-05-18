#!/usr/bin/python3
# Number guesser program by Eric Penrod

import random

def intro():

	print("This program generates a random integer.")
	print("You must try to guess that integer.")
	print("You will be given hints after each guess.")

def main():

	found = False

	ranNum = random.randint(1,100)
	# ranNum = 35		# for debugging use only

	userGuess = int(input("What is your guess? "))

	while not found:

		if userGuess == ranNum:
			print("That is correct!")
			found = True

		elif userGuess > ranNum:
			userGuess = int(input("Incorrect.  Guess lower: "))

		else:
			userGuess = int(input("Incorrect. Guess Higher: "))

intro()			
main()

# end of program

