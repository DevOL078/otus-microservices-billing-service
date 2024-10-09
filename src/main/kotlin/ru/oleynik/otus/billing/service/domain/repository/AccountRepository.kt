package ru.oleynik.otus.billing.service.domain.repository

import ru.oleynik.otus.billing.service.domain.entity.Account
import java.util.UUID

interface AccountRepository {
    fun findByUserId(userId: UUID): Account?
    fun save(account: Account): Account
    fun deleteById(id: UUID)
}