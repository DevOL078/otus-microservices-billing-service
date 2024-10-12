package ru.oleynik.otus.billing.service.port.`in`.controller

import org.springframework.web.bind.annotation.RestController
import ru.oleynik.otus.billing.service.port.`in`.controller.dto.AccountDto
import ru.oleynik.otus.billing.service.port.`in`.controller.dto.toDto
import ru.oleynik.otus.billing.service.service.AccountService
import java.math.BigDecimal
import java.util.UUID

@RestController
class RestAccountController(
    private val accountService: AccountService,
) : AccountController {
    override fun getAccountByUserId(userId: UUID): AccountDto {
        return accountService.getAccount(userId).toDto()
    }

    override fun increaseAccountSum(userId: UUID, amountDiff: BigDecimal): AccountDto {
        return accountService.changeAmount(userId, amountDiff).toDto()
    }
}