package ru.oleynik.otus.maven.service.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BillingServiceApp

fun main(args: Array<String>) {
	runApplication<BillingServiceApp>(*args)
}
