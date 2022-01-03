package com.kafkasub.entrypoint.controller

import com.kafkasub.infra.Producer
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*

@Controller
class ControllerKafka(
    private val  producer: Producer
){

    @Post
    fun request(@Body msg: String) {
        producer.sendMessage(UUID.randomUUID().toString(), msg)
    }
}