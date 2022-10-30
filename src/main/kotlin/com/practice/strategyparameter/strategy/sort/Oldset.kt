package com.practice.strategyparameter.strategy.sort

import org.springframework.stereotype.Component

@Component
class Oldset : SortStrategy {

    override fun getNews(): String? {
        return "오래된 순으로 정렬"
    }
}