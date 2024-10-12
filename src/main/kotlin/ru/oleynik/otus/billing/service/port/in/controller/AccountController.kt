package ru.oleynik.otus.billing.service.port.`in`.controller

import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.Digits
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import ru.oleynik.otus.billing.service.port.`in`.controller.dto.AccountDto
import java.math.BigDecimal
import java.util.UUID

@RequestMapping("/api/v1/account")
interface AccountController {

    @GetMapping("/{userId}")
    fun getAccountByUserId(@PathVariable("userId") userId: UUID): AccountDto

    @PatchMapping("/{userId}")
    fun increaseAccountSum(
        @PathVariable("userId") userId: UUID,
        @RequestParam("amountDiff")
        @Valid
        @DecimalMax(value = "0.0", inclusive = false)
        @Digits(integer = 3, fraction = 2)
        amountDiff: BigDecimal
    ): AccountDto

}