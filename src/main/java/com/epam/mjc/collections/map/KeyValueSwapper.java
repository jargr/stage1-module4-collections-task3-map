package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        var swapped = new HashMap<String, Integer>();
        for (var entry : sourceMap.entrySet()) {
            swapped.compute(entry.getValue(), (key, value) -> (value == null || entry.getKey() < value) ? entry.getKey() : value);
        }

        return swapped;
    }
}
