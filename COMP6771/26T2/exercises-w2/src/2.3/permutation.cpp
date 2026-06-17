#include "permutation.h"

#include <map>

auto is_permutation(const std::string &x, const std::string &y) -> bool {
    // using a map
    // unordered_map -> stock standard hashmap, dictionary
    // expected constant time operations

    // map -> sorted by keys
    // O(log n) complexity for most operations
    // [{"a", 4}, {"c", 1}, {"b", 3}]

    auto freq1 = std::unordered_map<char, int>{};
    auto freq2 = std::unordered_map<char, int>{};

    for (const auto& c : x) {
        ++freq1[c];
    }

    for (const auto& c : y) {
        ++freq2[c];
    }

    return freq1 == freq2;

    // alternative implementation, O(n log n)
    // std::string x_copy = x;
    // std::string y_copy = y;
    
    // std::sort(x_copy.begin(), x_copy.end());
    // std::sort(y_copy.begin(), y_copy.end());

    // return x_copy == y_copy;
}
