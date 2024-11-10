/**
 * No prior knowledge of C++ should be necessary to understand the point of this example.
 * 
 * A C++ program to demonstrate the iterator pattern 'in the wild'.
 * In order to de-couple algorithms from the actual type of container (to keep data encapsulated and
 * prevent having to create separate implementations for different data structures), algorithms in
 * modern languages are operated on the iterators (i.e. abstract pointers) and how they traverse through
 * elements, rather than the container itself!
 * 
 * Compilation: `g++ iterator.cpp -o iterator` (requires g++)
 * Execution: `./iterator`
 */

#include <algorithm>
#include <array>
#include <iostream>
#include <set>
#include <vector>

int main(void) {
    auto a = std::array<int, 5>{21, -5, 5, 2, 3}; // int[] a = {21, -5, 5, 2, 3};

    auto v = std::vector<int>{-45, 23, 4, 2, 6}; // List<Integer> v = new ArrayList<Integer>(-45, 23, 4, 2, 6);

    // To get an iterator representing the start of a container in C++, .begin() is used.
    // To get an iterator representing the end of a container in C++, .end() is used.
    // EXTRA NOTE: .end() does NOT point to the last element, but rather something representing
    // one PAST the last element, like NULL in a C linked list.

    // These sorting algorithms are not implemented for arrays and vectors separately...
    // They operate on the actual iterators!
    // How you should interpret this is: Sort all elements between the start and end of these containers.
    std::sort(a.begin(), a.end()); // Collections.sort(a);

    std::sort(v.begin(), v.end()); // Collections.sort(v);

    for (int num : a) {
        std::cout << num << " "; // System.out.print(num + " ");
    }
    std::cout << '\n'; // System.out.println();

    for (int num : v) {
        std::cout << num << " "; // System.out.print(num + " ");
    }
    std::cout << '\n'; // System.out.println();

    return 0;
}