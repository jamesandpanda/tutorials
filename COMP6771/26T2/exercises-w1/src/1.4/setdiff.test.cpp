#include "setdiff.h"

#include <catch2/catch.hpp>

TEST_CASE("set_difference()") {
	auto v1 = std::vector<char>{'h', 'e', 'l', 'l', 'o'};
	auto v2 = std::vector<char>{'w', 'o', 'r', 'l', 'd'};

	set_difference(v1, v2);

	const auto expected = std::vector<char>{'h', 'e'};
	REQUIRE(v1 == expected);
}
