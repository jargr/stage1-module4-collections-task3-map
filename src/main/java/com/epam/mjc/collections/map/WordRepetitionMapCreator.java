package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        var wordCount = new HashMap<String, Integer>();
        String[] words = sentence.trim().toLowerCase().split("\\s+|\\.|\\,");

        for (String word : words) {
            if (!word.isBlank()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;

    }
}
