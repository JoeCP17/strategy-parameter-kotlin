package com.practice.strategyparameter.controller

import com.practice.strategyparameter.service.NewsService
import com.practice.strategyparameter.strategy.SortStrategy
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class NewsController() {

    private var newsService: NewsService? = null

    fun NewsController(newsService: NewsService) {
        this.newsService = newsService
    }

    @GetMapping("/news")
    fun getNews(@RequestParam sort: SortStrategy?): String? {
        return newsService?.getNews(sort!!)
    }
}