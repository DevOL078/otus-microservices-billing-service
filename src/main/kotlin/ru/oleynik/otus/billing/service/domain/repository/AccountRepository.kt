package ru.oleynik.otus.billing.service.domain.repository

import ru.oleynik.otus.billing.service.domain.entity.Account
import ru.oleynik.otus.billing.service.exception.NotFoundException
import java.util.UUID

interface AccountRepository {
    fun findByUserId(userId: UUID): Account?
    fun save(account: Account): Account
    fun deleteById(id: UUID)

    fun findByUserIdOrThrow(userId: UUID): Account = findByUserId(userId)
        ?: throw NotFoundException("account with userId $userId not found")
}