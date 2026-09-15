#include "./min.h"
#include <iostream>
#include <string>
#include <vector>

auto main(void) -> int {
    auto a = my_min(1, 3);
    auto b = my_min(4.0, 2.0);

    auto v1 = std::vector<int>{1};
    auto v2 = std::vector<int>{2, 3};
    auto c = my_min(v1, v2);

    std::cout << a << '\n';
    std::cout << b << '\n';

    for (const auto& i : c) {
        std::cout << i << '\n';
    }
}