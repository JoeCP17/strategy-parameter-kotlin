package com.practice.strategyparameter.converter

import com.practice.strategyparameter.strategy.sort.SortStrategy
import org.springframework.context.ApplicationContext
import org.springframework.core.convert.converter.Converter

class StringToSortStrategyConverter(private val applicationContext: ApplicationContext) :
    Converter<String?, SortStrategy> {

    override fun convert(source: String): SortStrategy {
        return applicationContext.getBean(source, SortStrategy::class) as SortStrategy

    }
}