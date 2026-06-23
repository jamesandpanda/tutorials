#include "invert.h"

auto invert(const std::map<std::string, int> &mp) -> std::map<int, std::string> {
    auto result = std::map<int, std::string>{};
    // better syntax when looping over a map
    for (const auto& [k, v] : mp) {
        if (result.contains(v)) {
            if (result[v].size() < k.size()) {
                result[v] = k;
            }
        } else {
            result[v] = k;
        }
    }

    return result;
}
