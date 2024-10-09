package ru.oleynik.otus.billing.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["ru.oleynik.otus.billing.service"])
class BillingServiceApp

fun main(args: Array<String>) {
	runApplication<BillingServiceApp>(*args)
}
