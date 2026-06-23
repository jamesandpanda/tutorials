#include <iostream>
#include <string>
#include <vector>

// compilation: clang++ vowel_sort.cpp -o vowel_sort

auto is_vowel(const char& c) -> bool {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

auto cmp_vowels(std::string& s1, std::string& s2) -> bool {
    auto count1 = std::count_if(s1.begin(), s1.end(), is_vowel);
    auto count2 = std::count_if(s2.begin(), s2.end(), is_vowel);

    if (count1 == count2) {
        return s1 < s2;
    } else {
        return count1 < count2;
    }
}

auto vowel_sort(std::vector<std::string> &vs) -> void {
    std::sort(vs.begin(), vs.end(), cmp_vowels);
}

auto main(void) -> int {
    auto v = std::vector<std::string>{"hi", "aeiou", "xyz", "abc"};
    vowel_sort(v);

    for (const auto& s : v) {
        std::cout << s << '\n';
    }

    return 0;
}