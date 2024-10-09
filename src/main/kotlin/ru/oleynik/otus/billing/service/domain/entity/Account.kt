package ru.oleynik.otus.billing.service.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "accounts")
data class Account(
    @Id
    val id: UUID = UUID.randomUUID(),
    val userId: UUID,
    val amount: BigDecimal,
    val createDate: Instant = Instant.now(),
    val editDate: Instant = Instant.now(),
)
