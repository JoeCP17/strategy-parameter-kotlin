package com.practice.strategyparameter.controller

import com.practice.strategyparameter.service.NewsService
import com.practice.strategyparameter.strategy.sort.SortStrategy
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequiredArgsConstructor
class NewsController() {

    private val newsService: NewsService? = null

    @GetMapping("/news")
    fun getNews(@RequestParam sort: SortStrategy?): String? {
        return newsService!!.getNews(sort!!)
    }
}