package ru.oleynik.otus.billing.service.port.`in`.controller.account.dto

import ru.oleynik.otus.billing.service.domain.entity.Account
import java.math.BigDecimal
import java.util.UUID

data class AccountDto(
    val id: UUID,
    val userId: UUID,
    val amount: BigDecimal,
)

fun Account.toDto(): AccountDto = AccountDto(
    id = this.id,
    userId = this.userId,
    amount = this.amount,
)