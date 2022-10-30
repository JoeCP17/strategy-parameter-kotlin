package com.practice.strategyparameter.strategy

import org.springframework.stereotype.Component

@Component
class None : SortStrategy {
    override val news: String get() = "정렬하지 않는다."
}