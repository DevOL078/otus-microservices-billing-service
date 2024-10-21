package ru.oleynik.otus.billing.service.port.`in`.controller.account

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Digits
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import ru.oleynik.otus.billing.service.port.`in`.controller.account.dto.AccountDto
import java.math.BigDecimal
import java.util.UUID

@Tag(name = "Account operations")
@RequestMapping("/api/v1/account")
interface AccountController {

    @Operation(summary = "Get account by user ID")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Account information")
        ]
    )
    @GetMapping("/{userId}")
    fun getAccountByUserId(
        @PathVariable("userId")
        @Parameter(description = "User ID", required = true)
        userId: UUID
    ): AccountDto

    @Operation(summary = "Increase account amount")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Account information with increased amount")
        ]
    )
    @PatchMapping("/{userId}")
    fun increaseAccountSum(
        @PathVariable("userId")
        @Parameter(description = "User ID", required = true)
        userId: UUID,
        @RequestParam("amountDiff")
        @Valid
        @DecimalMin(value = "0.0", inclusive = false)
        @Digits(integer = 9, fraction = 2)
        @Parameter(description = "Amount difference in RUB", required = true)
        amountDiff: BigDecimal
    ): AccountDto

}