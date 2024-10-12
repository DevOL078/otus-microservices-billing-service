package ru.oleynik.otus.billing.service.config

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.listener.DefaultErrorHandler
import org.springframework.util.backoff.FixedBackOff
import ru.oleynik.otus.billing.service.config.properties.KafkaProperties

@Configuration
class KafkaConfig(
    private val kafkaProperties: KafkaProperties,
) {
    @Bean
    fun errorHandler(): DefaultErrorHandler {
        return DefaultErrorHandler(
            { consumerRecord: ConsumerRecord<*, *>, exception: Exception? ->
                // TODO: logger warning
            }, FixedBackOff(
                kafkaProperties.backOff.interval,
                kafkaProperties.backOff.maxAttempts,
            )
        ).also {
            it.addRetryableExceptions(ClassCastException::class.java)
        }
    }
}