#include <iostream>
#include <map>

int main(void) {
    auto map = std::unordered_map<char, int>{};

    // check if 'c' is in the map.
    if (map.find('c') == map.end()) {
        std::cout << "the key 'c' is not in the map.\n";
    } else {
        std::cout << "the key 'c' is in the map.\n";
    }

    // don't do this if you are trying to check for existence
    // because indexing directly into the map will automatically create
    // an entry for that key.
    // std::cout << "the value of 'c' in the map is " << map['c'] << '\n';
    return 0;
}