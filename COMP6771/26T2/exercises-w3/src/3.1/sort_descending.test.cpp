#include "./sort_descending.h"
#include <catch2/catch.hpp>

TEST_CASE("fill me in scotty") {
    std::vector<int> v = {6, 3, 2, 4, 1};
    std::vector<int> expected = {6, 4, 3, 2, 1};

    sort_descending(v);
    REQUIRE(v == expected);
}
