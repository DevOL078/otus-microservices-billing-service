package ru.oleynik.otus.maven.service.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MavenServiceTemplateApplication

fun main(args: Array<String>) {
	runApplication<MavenServiceTemplateApplication>(*args)
}
