package com.dbeginc.dbgram

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbgramApplication

fun main(args: Array<String>) {
    runApplication<DbgramApplication>(*args)
}
