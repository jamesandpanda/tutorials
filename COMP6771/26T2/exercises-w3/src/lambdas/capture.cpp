#include <iostream>

// compilation: clang++ capture.cpp -o capture

auto capture_copy(void) -> void {
    auto x = 1;
    auto y = 2;

    // this capture will copy x and y. this copy is const/immutable
    auto fn = [x, y](void) -> void {
        // can't do x++ because x (and y) is const
        std::cout << "capture_copy fn(): " << x << ' ' << y << '\n';
    };

    fn();
}

auto capture_ref(void) -> void {
    auto x = 1;
    auto y = 2;

    // you can capture references to prevent copying. this reference to x is mutable
    // so any changes to the variable will affect it outside of the function as well
    // y isn't being captured by reference so a copy is being made
    auto fn = [&x, y](void) -> void {
        x = 10;
        std::cout << "capture_ref fn(): " << x << ' ' << y << '\n';
    };

    fn(); // prints 10 2 (x can be modified)

    std::cout << "capture_ref outside of fn(): " << x << ' ' << y << '\n'; // prints 10 2 because
    // the modification to x stays
}

auto capture_default(void) -> void {
    auto x = 1;
    auto y = 2;

    // this captures any variable used inside of the function by reference automatically
    // y shouldn't be captured because it's not used here
    // it is best practice NOT to use this!! you may accidentally capture dangling references.
    auto fn = [&](void) {
        x = 5;
        std::cout << "capture_default fn(): " << x << '\n'; // prints 5
    };

    // NOTE: capturing [=] does something similar to [&], but makes a copy of everything instead.
    // this is bad for performance, so this should also be avoided.

    fn();

    std::cout << "capture_default outside of fn(): " << x << '\n'; // prints 5 because
    // x was captured by reference so it was changed in fn()
}

auto main(void) -> int {
    capture_copy();

    capture_ref();

    capture_default();
}
