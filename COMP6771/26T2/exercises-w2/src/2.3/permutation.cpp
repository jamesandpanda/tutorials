#include "permutation.h"

auto is_permutation(const std::string &x, const std::string &y) -> bool {
    // std::sort sorts in place, so have to make a copy of x and y
    auto s1 = x;
    std::sort(s1.begin(), s1.end());

    auto s2 = y;
    std::sort(s2.begin(), s2.end());
    
    return s1 == s2;
}
