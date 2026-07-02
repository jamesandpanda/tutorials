#include <algorithm>
#include <optional>
#include <string>
#include <vector>

#include "./x_vector.h"

const char SPECIAL_LETTER = 'x';

/**
    0. HELPER METHODS
 */

auto string_contains_special(std::string const s) -> bool {
    // .find returns the constant npos if the character was not found
    return s.find(SPECIAL_LETTER) != std::string::npos;
}

// namespace {
//     auto string_contains_special(std::string const s) -> bool {
//         // .find returns the constant npos if the character was not found
//         return s.find(SPECIAL_LETTER) != std::string::npos;
//     }
// }

/**
    1. CONSTRUCTORS
*/

xector::xector() = default;

// initialiser list e.g. std::vector<int>{1, 2, 3, 4}
xector::xector(std::initializer_list<std::string> items) :
    items_{items.begin(), items.end()} {};

xector::xector(std::vector<std::string>::const_iterator start, std::vector<std::string>::const_iterator end)
    : items_{start, end} {}

xector::xector(std::vector<std::string> const &items) {
    items_ = std::vector(items.begin(), items.end());
}

/**
    2. CLASS METHODS
*/

size_t xector::size() {
    auto result = std::count_if(items_.begin(), items_.end(), string_contains_special);

    return static_cast<std::size_t>>(result);
}

auto xector::first() -> std::optional<std::string> {
    auto search = std::find_if(items_.begin(), items_.end(), string_contains_special);
    return (search == items_.end() ? std::nullopt : std::optional<std::string>(*search));
}

auto xector::last() const -> std::optional<std::string> {
    auto search = std::find_if(items_.rbegin(), items_.rend(), string_contains_special);
    return (search == items_.rend()) ? std::nullopt : std::optional<std::string>(*search);
}

auto xector::push_back(std::string item) -> void {
    items_.push_back(item);
}
