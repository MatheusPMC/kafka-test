package com.kafkasub.infra

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.context.annotation.Factory

@Factory
@KafkaClient
interface Producer {

    @Topic("test")
    fun sendMessage(@KafkaKey id: String, msg:String)
}