package com.practice.strategyparameter.strategy

import org.springframework.stereotype.Component

@Component
class Oldset : SortStrategy {
    override val news: String get() = "오래된 순으로 뉴스 정렬"
}