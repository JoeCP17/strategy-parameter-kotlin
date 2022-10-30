package com.practice.strategyparameter.config

import com.practice.strategyparameter.converter.StringToSortStrategyConverter
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class WebMvcConfig(private val applicationContext: ApplicationContext) : WebMvcConfigurer {
    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverter(StringToSortStrategyConverter(applicationContext))
    }
}