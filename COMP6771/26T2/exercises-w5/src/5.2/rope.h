#ifndef COMP6771_ROPE_H
#define COMP6771_ROPE_H

#include <string>
#include <vector>
#include <utility>

class rope {
    class iter {
	public:
		using iterator_category = std::bidirectional_iterator_tag;
		using value_type = char;
		using reference = const value_type&;
		using pointer = void;
		using difference_type = std::ptrdiff_t;

		iter() = default;

		auto operator++() -> iter&;

		auto operator--() -> iter&;

		auto operator++(int) -> iter;

		auto operator--(int) -> iter;

		auto operator*() const -> reference;

		friend auto operator==(const iter& lhs, const iter& rhs) -> bool {
			// define here
			return true;
		}

	private:
		using outer_t = std::vector<std::string>::const_iterator;
		using inner_t = std::string::const_iterator;

		iter(outer_t first, outer_t last) {
			// define here
		}

		friend class rope;
    };

public:
	using iterator = iter;
	using const_iterator = iter;
	using reverse_iterator = std::reverse_iterator<iterator>;
	using const_reverse_iterator = std::reverse_iterator<const_iterator>;

	rope() = default;

	explicit rope(std::vector<std::string> rope) : rope_{std::move(rope)} {}

	auto begin() -> iterator {
		return { rope_.begin(), rope_.end() };
	}
	
	auto end() -> iterator {
		return { rope_.end(), rope_.end() };
	}

	auto begin() const -> const_iterator {
		return { rope_.begin(), rope_.end() };
	}

	auto end() const -> const_iterator {
		return { rope_.end(), rope_.end() };
	}

	auto cbegin() const -> const_iterator {
		return begin();
	}

	auto cend() const -> const_iterator {
		return end();
	}

	auto rbegin() -> reverse_iterator {
		return reverse_iterator{ end() };
	}
	
	auto rend() -> reverse_iterator {
		return reverse_iterator{ begin() };
	}
	
	auto rbegin() const -> const_reverse_iterator {
		return const_reverse_iterator{ end() };
	}
	
	auto rend() const -> const_reverse_iterator {
		return const_reverse_iterator{ begin() };
	}
	
	auto crbegin() const -> const_reverse_iterator {
		return rbegin();
	}
	
	auto crend() const -> const_reverse_iterator {
		return rend();
	}

private:
	std::vector<std::string> rope_;
};

#endif // COMP6771_ROPE_H