package com.kopring.demo

import com.kopring.demo.config.requestToTrsServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
	print(
			String(
					requestToTrsServer(
							niceVanlp = "127.0.0.1",
							niceVanPort = 9999,
							buffer = "Hello Server!".toByteArray()
					)

			)
	)
}
