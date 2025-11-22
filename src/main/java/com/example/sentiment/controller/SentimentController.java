package com.example.sentiment.controller;

import com.example.sentiment.model.SentimentResponse;
import com.example.sentiment.service.SentimentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentimentController {

    private final SentimentService sentimentService;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }

    @GetMapping("/api/sentiment")
    public SentimentResponse getSentiment(@RequestParam(name = "text", required = false) String text) {
        String sentiment = sentimentService.analyzeSentiment(text);
        return new SentimentResponse(sentiment);
    }
}
