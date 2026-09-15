#include <string>

template <typename T>
auto my_min(T x, T y) -> T {
    return (x < y) ? x : y;
}
