#include "scale.h"

auto scale(std::vector<int> &ivec, double factor) -> std::vector<double> {
    // syntax: static_cast<type>(thing you are typecasting)

    auto vec = std::vector<int>{};

    auto output = std::vector<double>{};
    for (int num : ivec) {
        output.push_back(static_cast<double>(num * factor));
    }

    return output;
}
