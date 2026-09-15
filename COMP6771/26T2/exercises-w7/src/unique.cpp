#include <memory>
#include <iostream>
#include <vector>

class Example {
public:
    ~Example() {
        std::cout << "called destructor\n" << '\n';
    }
};

auto main(void) -> int {
    // making a unique pointer = allocating heap memory
    auto p = std::make_unique<Example>();

    std::cout << "this happens\n";
}