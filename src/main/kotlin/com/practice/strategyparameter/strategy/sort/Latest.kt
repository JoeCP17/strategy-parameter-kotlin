package com.practice.strategyparameter.strategy.sort

import org.springframework.stereotype.Component

@Component
class Latest : SortStrategy {
    override fun getNews(): String? {
        return "최신순으로 정렬"
    }
}