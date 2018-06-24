#!/usr/bin/python
# Number guesser program by Eric Penrod

import random

def main():

	found = False

	ranNum = random.randint(1,100)
	# ranNum = 35		# for debugging use only

	userGuess = input("What is your guess? ")

	while not found:

		if userGuess == ranNum:
			print"That is correct!"
			found = True

		elif userGuess > ranNum:
			userGuess = input("Incorrect.  Guess lower: ")

		else:
			userGuess = input("Incorrect. Guess Higher: ")

main()

# end of program

