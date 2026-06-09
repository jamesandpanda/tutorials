#include "fib_vector.h"
#include <iostream>

auto fibonacci(int n) -> std::vector<int> {
	if (n == 0) {
		return std::vector<int>{};
	} else if (n == 1) {
		return std::vector<int>{1};
	}

	auto nums = std::vector<int>{};
	nums.push_back(1);
	nums.push_back(2);

	auto n_new = static_cast<std::size_t>(n);
	for (auto i = 2ul; i < n_new; ++i) {
		nums.push_back(nums[i - 1] + nums[i - 2]);
	}

	return nums;
}
