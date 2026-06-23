#include <iostream>
#include <string>
#include <functional>

// compilation: clang++ more_captures.cpp -o more_captures

auto capture_mutable(void) -> void {
    auto x = 1;
    auto y = 2;

    // this capture will copy x and y, but make the copies mutable
    // this makes BOTH x and y mutable. there is syntax for only making specific
    // variables mutable, but it's easier to just capture by ref at this point
    auto fn = [x, y](void) mutable {
        x = 5;
        std::cout << "capture_mutable fn(): " << x << ' ' << y << '\n';
    };

    fn(); // prints 5 2
    std::cout << "capture_mutable outside of fn(): " << x << ' ' << y << '\n'; // prints 1 2
    // because the x changed in the lambda was a copy
}

// this demonstrates undefined behaviour: a reference of a string is captured,
// but the string will go out of scope at the end of this function
// so the lambda function being returned will outlive the reference

// it would be fine to not mention the return type of the function explicitly here because auto YAY!!
// in general, the type of a function is std::function<return_type(type of params)>
auto capture_undefined_behaviour(void) -> std::function<void(void)> {
    auto s = std::string{"abcdefghi"};

    auto fn = [&s](void) {
        std::cout << "capture_undefined_behaviour fn(): " << s << '\n';
    };

    return fn;
}

auto main(void) -> int {
    capture_mutable();

    auto fn = capture_undefined_behaviour();
    fn(); // bad!! undefined behaviour means you no longer have any guarantees about
    // how your program runs from this point onwards.
}
