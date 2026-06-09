#include "permutation.h"

auto is_permutation(const std::string &x, const std::string &y) -> bool {
    auto s1 = x;
    std::sort(s1.begin(), s1.end());

    auto s2 = y;
    std::sort(s2.begin(), s2.end());
    
    return s1 == s2;

    auto s = std::string{};
    int i = 0;
}
