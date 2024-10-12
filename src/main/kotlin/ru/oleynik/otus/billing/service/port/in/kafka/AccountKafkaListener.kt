package ru.oleynik.otus.billing.service.port.`in`.kafka

import jakarta.validation.Valid
import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import ru.oleynik.otus.billing.service.config.KafkaListenerTopics
import ru.oleynik.otus.billing.service.service.AccountService
import ru.oleynik.otus.common.kafka.account.CreateAccountEvent
import ru.oleynik.otus.common.kafka.account.DecreaseAccountAmountEvent

@Component
@KafkaListener(
    topics = [
        KafkaListenerTopics.CREATE_ACCOUNT_TOPIC,
        KafkaListenerTopics.DECREASE_ACCOUNT_AMOUNT_TOPIC,
    ]
)
class AccountKafkaListener(
    private val accountService: AccountService,
) {

    @KafkaHandler
    fun createAccount(@Valid event: CreateAccountEvent) {
        accountService.create(event.userId)
    }

    @KafkaHandler
    fun decreaseAccountAmount(@Valid event: DecreaseAccountAmountEvent) {
        accountService.changeAmount(event.userId, event.diffAmount)
    }

}