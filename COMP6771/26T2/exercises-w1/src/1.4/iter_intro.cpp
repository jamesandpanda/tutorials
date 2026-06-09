#include <iostream>
#include <vector>

auto main(void) -> int {
    auto v = std::vector<int>{1, 2, 3, 4};

    // you can dereference iterators just like pointers
    // to get the value that it is "looking" at
    auto iter = v.begin();
    std::cout << *iter << '\n';

    ++iter;
    std::cout << *iter << '\n';

    for (const auto& num : v) {
        std::cout << num << '\n';
    }

    for (auto iter = v.begin(); iter != v.end(); ++iter) {
        std::cout << *iter << '\n';
    }

    // DONT DO THIS - undefined behaviour
    auto bad_iter = v.end();
    std::cout << *bad_iter << '\n';
}