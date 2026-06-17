#include <utility>
#include <vector>

#include "mismatch.h"

auto mismatch(std::vector<int>& v1, std::vector<int>& v2) -> std::pair<iter, iter> {
    auto it1 = v1.begin();
    auto it2 = v2.begin();

    // these are const iterators (they start with c)
    // they are read-only iterators, cannot modify the value they are "looking at"
    v1.cbegin();
    v2.cend();

    while (it1 != v1.end() && it2 != v2.end()) {
        if (*it1 != *it2) {
            return std::make_pair(it1, it2);
            // return {it1, it2};
        } else {
            ++it1;
            ++it2;
        }
    }

    return std::make_pair(it1, it2);
}
