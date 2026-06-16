#include "vowel_sort.h"

#include <catch2/catch.hpp>

TEST_CASE("sort it out") {
    auto words = std::vector<std::string>{"hi", "abc", "xyz", "aeiou"};
    const auto expected = std::vector<std::string>{"xyz", "abc", "hi", "aeiou"};

    vowel_sort(words);
    REQUIRE(words == expected);
}
