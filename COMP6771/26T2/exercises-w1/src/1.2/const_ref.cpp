#include <iostream>

static auto fn_1() -> void;
static auto fn_2() -> void;
static auto fn_3() -> void;
static auto fn_4() -> void;

int main(void) {
	fn_1();
	fn_2();
	fn_3();
	fn_4();

	return 0;
}

// Auto
// works
static auto fn_1() -> void {
	auto i = 3;
	i = 4;
	std::cout << i << "\n";
}

// Auto and Const
// doesn't work because j is const, so it cannot be modified
static auto fn_2() -> void {
	auto const j = 5;
	--j;
	std::cout << j << "\n";
}

// Reference
// works
static auto fn_3() -> void {
	auto age = 18;
	auto& my_age = age;
	++my_age;
	std::cout << my_age << "\n";
}

// Const and Reference
// doesn't work because my_age is a const ref, and the original value cannot be
// modified using const refs
static auto fn_4() -> void {
	auto age = 21;
	const auto& my_age = age;
	--my_age;
	std::cout << my_age << "\n";
}
