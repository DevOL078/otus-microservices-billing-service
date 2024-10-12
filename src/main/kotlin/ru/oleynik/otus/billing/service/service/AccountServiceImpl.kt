package ru.oleynik.otus.billing.service.service

import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import ru.oleynik.otus.billing.service.domain.entity.Account
import ru.oleynik.otus.billing.service.domain.repository.AccountRepository
import ru.oleynik.otus.billing.service.domain.repository.findByUserIdOrThrow
import java.math.BigDecimal
import java.util.UUID

@Component
class AccountServiceImpl(
    private val accountRepository: AccountRepository
) : AccountService {
    @Transactional(readOnly = true)
    override fun getAccount(userId: UUID): Account = accountRepository.findByUserIdOrThrow(userId)

    @Transactional
    override fun create(userId: UUID): Account {
        val account = Account(userId = userId)
        return accountRepository.save(account)
    }

    @Transactional
    override fun changeAmount(userId: UUID, diffAmount: BigDecimal): Account {
        return accountRepository.findByUserIdOrThrow(userId)
            .also {
                it.amount = it.amount.add(diffAmount)
            }
    }

    @Transactional
    override fun deleteAccount(userId: UUID) {
        accountRepository.findByUserIdOrThrow(userId).also {
            accountRepository.deleteById(it.id)
        }
    }
}