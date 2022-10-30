package com.practice.strategyparameter.service

import com.practice.strategyparameter.strategy.SortStrategy
import org.springframework.stereotype.Service


@Service
class NewsService {

    fun getNews(sortStrategy: SortStrategy): String? {
        return sortStrategy.news
    }
}