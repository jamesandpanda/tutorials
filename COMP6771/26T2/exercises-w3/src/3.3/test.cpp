#include <iostream>
#include <fstream>
#include <vector>
#include <iterator>

int main(void) {
    // first method, i still have strings.
    auto fp = std::ifstream{"marks.txt"};
    auto buffer = std::string{};

    while (std::getline(fp, buffer)) {
        std::cout << "read value: " << buffer << '\n';
    }

    
    // second method, you get a vector of integers out
    auto fp2 = std::ifstream{"marks.txt"};
    auto vector = std::vector<int>{std::istream_iterator<int>{fp2}, std::istream_iterator<int>{}};

    for (const auto& num : vector) {
        std::cout << "alternate way of reading, read value: " << num << '\n';
    }

    return 0;
}