// a series of numbers in which each number ( Fibonacci number ) is the sum of
// the two preceding numbers. The simplest is the series
// 1, 1, 2, 3, 5, 8, etc.

#include <iostream>

using namespace std;

int main()
{
	int a = 1, b = 1, c = 3;
	cout << "1st number is::: " << a << endl << "2nd number is::: " << b << endl;

	int i = 3;
	while (i < 25)
	{
		c = a + b;
		a = b;
		b = c;
		cout << i << "th number is::: " << c << endl;
		i++;
	}

	cout << "And continues... ";
	return 0;
}

// END

