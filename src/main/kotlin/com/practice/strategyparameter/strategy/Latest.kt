package com.practice.strategyparameter.strategy

import org.springframework.stereotype.Component

@Component
class Latest : SortStrategy {
    override val news: String get() = "최신순으로 뉴스 정렬"
}