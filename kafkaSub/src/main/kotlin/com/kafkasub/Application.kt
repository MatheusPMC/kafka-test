package com.kafkasub

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.kafkasub")
		.start()
}

