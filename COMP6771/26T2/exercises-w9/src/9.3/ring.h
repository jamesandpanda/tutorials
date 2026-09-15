#ifndef COMP6771_RING_H
#define COMP6771_RING_H

#include <cstddef>
#include <utility>
#include <initializer_list>

template<typename T, std::size_t N>
class Ring {
public:
    template <typename InputIt>
    Ring(InputIt first, InputIt end):
        head_{0},
        tail_{0},
        size_{0} // represents the current number of elements
        {};
        // imagine i wrote this

    Ring(std::initializer_list<T> il):
        Ring(il.begin(), il.end()) {};

private:
    T[N] elems_;
    std::size_t head_; // index where we insert into
    std::size_t tail_; // index where we take from
    std::size_t size_;
};

#endif // COMP6771_RING_H
