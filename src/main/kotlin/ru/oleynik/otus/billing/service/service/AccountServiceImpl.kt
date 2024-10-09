package ru.oleynik.otus.billing.service.service

import org.springframework.stereotype.Component
import ru.oleynik.otus.billing.service.domain.entity.Account
import ru.oleynik.otus.billing.service.domain.repository.AccountRepository
import java.math.BigDecimal
import java.util.UUID

@Component
class AccountServiceImpl(
    private val accountRepository: AccountRepository
) : AccountService {
    override fun isAccountExists(userId: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun create(userId: UUID): Account {
        TODO("Not yet implemented")
    }

    override fun changeAmount(userId: UUID, diffAmount: BigDecimal): Account {
        TODO("Not yet implemented")
    }

    override fun deleteAccount(userId: UUID) {
        TODO("Not yet implemented")
    }
}