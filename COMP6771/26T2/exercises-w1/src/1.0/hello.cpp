#include <iostream>
#include <string>

int main(void) {
    std::cout << "Hello World\n";

    // scan in all inputted strings, separated by whitespace
    // the loop runs until it reaches EOF
    std::string s;
    while (std::cin >> s) {
        std::cout << s << '\n';
    };

    return 0;
}
