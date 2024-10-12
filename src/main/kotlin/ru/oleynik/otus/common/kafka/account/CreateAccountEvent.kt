package ru.oleynik.otus.common.kafka.account

import java.util.UUID

data class CreateAccountEvent(
    val userId: UUID
)