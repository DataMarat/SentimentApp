package com.example.sentiment.service;

import org.springframework.stereotype.Service;

@Service
public class SentimentService {

    public String analyzeSentiment(String text) {
        if (text == null || text.isBlank()) {
            return "neutral";
        }

        String lower = text.toLowerCase();

        if (lower.contains("good") || lower.contains("great") || lower.contains("excellent") || lower.contains("hello")
                || lower.contains("супер") || lower.contains("отлично") || lower.contains("круто")) {
            return "positive";
        }

        if (lower.contains("bad") || lower.contains("terrible") || lower.contains("awful")
                || lower.contains("плохо") || lower.contains("ужасно")) {
            return "negative";
        }

        return "neutral";
    }
}
