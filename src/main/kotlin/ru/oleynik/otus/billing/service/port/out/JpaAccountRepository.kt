package ru.oleynik.otus.billing.service.port.out

import org.springframework.data.jpa.repository.JpaRepository
import ru.oleynik.otus.billing.service.domain.entity.Account
import ru.oleynik.otus.billing.service.domain.repository.AccountRepository
import java.util.UUID

interface JpaAccountRepository : AccountRepository, JpaRepository<Account, UUID> {
    override fun findByUserId(userId: UUID): Account?
}