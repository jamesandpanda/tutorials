#include "fib_vector.h"

#include <catch2/catch.hpp>

TEST_CASE("Works when n == 0") {
	const auto expected = std::vector<int>{};
	auto nums = fibonacci(0);

	REQUIRE(nums == expected);
}

TEST_CASE("Works when n == 1") {
	auto nums = fibonacci(1);

	REQUIRE(!nums.empty());
	REQUIRE(nums.size() == 1);

	REQUIRE(nums[0] == 1);
	REQUIRE(nums.at(0) == 1);
}

TEST_CASE("Works when n == 5") {
	const auto expected = std::vector<int>{1, 2, 3, 5, 8};
	auto nums = fibonacci(5);

	REQUIRE(expected == nums);
}

// add more tests here...
