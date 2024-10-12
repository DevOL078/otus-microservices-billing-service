package ru.oleynik.otus.billing.service.service

import ru.oleynik.otus.billing.service.domain.entity.Account
import java.math.BigDecimal
import java.util.UUID

interface AccountService {

    fun getAccount(userId: UUID): Account
    fun create(userId: UUID): Account
    fun changeAmount(userId: UUID, diffAmount: BigDecimal): Account
    fun deleteAccount(userId: UUID)

}