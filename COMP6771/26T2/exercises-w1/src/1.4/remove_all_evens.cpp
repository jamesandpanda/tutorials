#include <iostream>
#include <vector>

auto main(void) -> int {
    auto v = std::vector<int>{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (auto iter = v.begin(); iter != v.end(); ) {
        // vector.erase(iterator) -> removes the element at that iterator
        // and then returns an iterator to the next element
        
        if (*iter % 2 == 0) {
            iter = v.erase(iter);
        } else {
            ++iter;
        }
    }

    for (const auto& num : v) {
        std::cout << num << '\n';
    }
}