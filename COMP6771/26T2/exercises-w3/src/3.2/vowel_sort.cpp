#include "vowel_sort.h"

#include <iostream>

auto vowel_sort(std::vector<std::string> &vs) -> void {
    auto const count_vowels = [](char c) -> bool {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    };

    // the square brackets are called "closures"
    auto const fn = [count_vowels](std::string& s1, std::string& s2) -> bool {
        auto count1 = std::count_if(s1.begin(), s1.end(), count_vowels);
        auto count2 = std::count_if(s2.begin(), s2.end(), count_vowels);

        if (count1 == count2) {
            return s1 < s2;
        } else {
            return count1 < count2;
        }
    };

    std::sort(vs.begin(), vs.end(), fn);
}
