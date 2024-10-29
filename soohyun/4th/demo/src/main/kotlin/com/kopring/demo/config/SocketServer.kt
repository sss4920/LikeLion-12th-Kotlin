package com.kopring.demo.config

import okio.*
import org.springframework.stereotype.Component
import java.net.ServerSocket
import java.util.concurrent.TimeUnit

fun main() {
    SocketServer().server()
}

class SocketServer {

    fun server() {
        val serverSocket = ServerSocket(9999)

        while (true) {
            val client = serverSocket.accept()

            val bufferedSource = client.source().buffer()
            bufferedSource.timeout().timeout(READ_TIME_OUT, TimeUnit.MICROSECONDS)
            val readByteArray = bufferedSource.readByteArray()
            println(String(readByteArray))

            val bufferedSink = client.sink().buffer() // 내부적으로 getOutputStream을 호출.
            bufferedSink.timeout().timeout(WRITE_TIME_OUT, TimeUnit.MICROSECONDS)
            bufferedSink.write(readByteArray)
            bufferedSink.flush()
            client.shutdownOutput()
        }
    }


}