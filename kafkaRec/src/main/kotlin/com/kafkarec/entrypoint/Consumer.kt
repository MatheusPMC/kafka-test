package com.kafkarec.entrypoint

import io.micronaut.configuration.kafka.annotation.*
import io.micronaut.http.annotation.Body
import jakarta.inject.Singleton

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class Consumer {

    @Topic("test")
    fun receiveMessage(@KafkaKey id: String, msg: String) {
        print(msg)
    }
}