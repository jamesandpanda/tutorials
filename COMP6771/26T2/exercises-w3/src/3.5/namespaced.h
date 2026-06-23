#ifndef COMP6771_NAMESPACED_H
#define COMP6771_NAMESPACED_H

#include <string>
#include <vector>

struct celestial_body {
    std::string name;
    int pos;
};

namespace comp6771 {
    using vector = std::vector<int>; // for comp6771::vector, which instantly makes it a vector<int>
    using celestial_body = celestial_body; // for comp6771::celestial_body
    using planet = celestial_body; // for comp6771::planet

    // after doing namespace spaceland = comp6771, you can treat the two namespaces as the same
    // e.g. comp6771::planet and spaceland::planet will be the same.
    
    // nested namespace for comp6771::planets
    namespace planets {
        using terrestrial = celestial_body; // for comp6771::planets::terrestrial
        // you could also do `using terrestrial = planet;` at this point
    }

    auto test() -> void {
        // just to demonstrate calling comp6771::test()
    }
}

namespace comp4128 {
    auto test() -> void {
        // just to demonstrate calling comp4128::test(), same method name as
        // above but it's ok because they are in separate namespaces.
    }
}

// Hint: type aliases in modern C++ also use the "using" directive...

#endif // COMP6771_NAMESPACED_H
