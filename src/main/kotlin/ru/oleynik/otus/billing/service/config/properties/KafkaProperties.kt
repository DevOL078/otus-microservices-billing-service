package ru.oleynik.otus.billing.service.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "application.kafka")
data class KafkaProperties(
    val enabled: Boolean,
    val backOff: KafkaBackoffProperties,
)

data class KafkaBackoffProperties(
    val interval: Long,
    val maxAttempts: Long,
)