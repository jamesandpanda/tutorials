#include <vector>
#include <iostream>

int main(void) {
    auto v = std::vector<int>{};
    v.push_back(0);
    v.push_back(1);

    for (const auto& num : v) {
        std::cout << num << '\n';
    }

    return 0;
}