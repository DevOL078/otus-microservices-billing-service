package ru.oleynik.otus.billing.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["ru.oleynik.otus.billing.service"])
@ConfigurationPropertiesScan("ru.oleynik.otus.billing.service.config.properties")
class BillingServiceApp

fun main(args: Array<String>) {
    runApplication<BillingServiceApp>(*args)
}
