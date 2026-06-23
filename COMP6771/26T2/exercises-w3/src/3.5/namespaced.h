#ifndef COMP6771_NAMESPACED_H
#define COMP6771_NAMESPACED_H

#include <string>

struct celestial_body {
    std::string name;
    int pos;
};

namespace comp6771 {
    using std::vector; // for comp6771::vector
    using celestial_body = celestial_body; // for comp6771::celestial_body

    auto test() -> void {
        //
    }
}

namespace comp4128 {
    auto test() -> void {
        //
    }
}

// Hint: type aliases in modern C++ also use the "using" directive...

#endif // COMP6771_NAMESPACED_H
