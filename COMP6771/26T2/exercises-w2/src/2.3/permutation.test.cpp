#include "permutation.h"
#include <catch2/catch.hpp>

TEST_CASE("true case") {
    REQUIRE(is_permutation("listen", "silent"));
}

TEST_CASE("empty case") {
    REQUIRE(is_permutation("", ""));
}

TEST_CASE("false case") {
    REQUIRE(!is_permutation("hello", "world"));
}
