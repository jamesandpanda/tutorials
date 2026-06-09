#include <iostream>
#include <vector>

auto main(void) -> int {
    auto v = std::vector<int>{1, 2, 3, 4, 3};
    std::erase(v, 3);

    for (int num : v) {
        std::cout << num << '\n';
    }

    return 0;
}