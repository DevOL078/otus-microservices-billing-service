package ru.oleynik.otus.billing.service.config

class KafkaListenerTopics {
    companion object {
        const val CREATE_ACCOUNT_TOPIC = "create-account"
        const val DECREASE_ACCOUNT_AMOUNT_TOPIC = "decrease-account-amount"
    }
}