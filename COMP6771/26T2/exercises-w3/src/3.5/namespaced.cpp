#include "namespaced.h"

#include <iostream>

int main() {
    comp6771::test();
    namespace spaceland = comp6771;
    spaceland::test();

    // this is a better alternative to using namespace std if you need
    // to use vector a lot.
    using std::vector;
    vector<int> example;

    // should be an alias for std::vector<int>.
    auto v = comp6771::vector{6771};
 
    // name: earth, position from sun: 3
    // a planet is a kind of
    auto earth = spaceland::planet{"earth", 3};

    // should produce an object with the same type as the "earth" variable above.
    auto old_earth = spaceland::planets::terrestrial{"earth", 3};

    std::cout << v[0] << std::endl;
    std::cout << earth.name << std::endl;
    std::cout << old_earth.pos << std::endl;
}
