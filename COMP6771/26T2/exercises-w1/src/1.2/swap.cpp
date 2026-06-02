#include <iostream>

void swap(int& x, int& y) {
    int temp = y;
    y = 5;
    x = temp;
}

int main(void) {
    auto x = 3;
    auto y = 4;
    auto const i = 0;
    const auto j = 0;

    swap(x, y);
    std::cout << x << " " << y << '\n';
    return 0;
}