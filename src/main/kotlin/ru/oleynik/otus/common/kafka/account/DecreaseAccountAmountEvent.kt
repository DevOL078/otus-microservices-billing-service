package ru.oleynik.otus.common.kafka.account

import jakarta.validation.constraints.DecimalMax
import java.math.BigDecimal
import java.util.UUID

data class DecreaseAccountAmountEvent(
    val userId: UUID,
    @DecimalMax(value = "0.0", inclusive = false)
    val diffAmount: BigDecimal,
)
