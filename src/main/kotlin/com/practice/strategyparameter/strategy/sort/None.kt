package com.practice.strategyparameter.strategy.sort

import org.springframework.stereotype.Component

@Component
class None : SortStrategy {

    override fun getNews(): String? {
        return "정렬하지 않습니다."
    }
}