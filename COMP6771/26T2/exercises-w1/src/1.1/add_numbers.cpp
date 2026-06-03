#include <iostream>
#include <vector>
#include <string>

int main(void) {
	auto i = 0;
	auto j = 0;

	std::cout << "Please enter two numbers: ";

	// if either scan didn't work (e.g. user inputs "hi" for i)
	if (not (std::cin >> i) or not(std::cin >> j)) {
		std::cout << "Something went wrong while loading an integer, bailing...\n";
		return -1;
	}

	auto sum = i + j;
	std::cout << "Sum: " << sum << '\n';

	return 0;
}
