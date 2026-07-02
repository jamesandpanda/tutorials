#include "./rope.h"

// "abc"
// "def"
// "ghi"
// ""
// "jkl"

// "abcdefghijkl"

auto rope::iter::operator++() -> iter& {
    // TODO
}

auto rope::iter::operator--() -> iter& {
    // TODO
}

auto rope::iter::operator++(int) -> iter {
    // TODO
}

auto rope::iter::operator--(int) -> iter {
    // TODO
}

auto rope::iter::operator*() const -> reference {
    // TODO
}

auto rope::begin() -> iterator {
		return { rope_.begin(), rope_.end() };
	}
	
auto rope::end() -> iterator {
    return { rope_.end(), rope_.end() };
}

auto rope::begin() const -> const_iterator {
    return { rope_.begin(), rope_.end() };
}

auto rope::end() const -> const_iterator {
    return { rope_.end(), rope_.end() };
}

auto rope::cbegin() const -> const_iterator {
    return begin();
}

auto rope::cend() const -> const_iterator {
    return end();
}

auto rope::rbegin() -> reverse_iterator {
    return reverse_iterator{ end() };
}

auto rope::rend() -> reverse_iterator {
    return reverse_iterator{ begin() };
}

auto rope::rbegin() const -> const_reverse_iterator {
    return const_reverse_iterator{ end() };
}

auto rope::rend() const -> const_reverse_iterator {
    return const_reverse_iterator{ begin() };
}

auto rope::crbegin() const -> const_reverse_iterator {
    return rbegin();
}

auto rope::crend() const -> const_reverse_iterator {
    return rend();
}
