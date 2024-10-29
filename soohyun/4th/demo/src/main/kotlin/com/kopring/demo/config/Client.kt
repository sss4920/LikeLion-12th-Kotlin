package com.kopring.demo.config

import okio.*
import java.net.InetSocketAddress
import java.net.Socket
import java.util.concurrent.TimeUnit
import kotlin.io.use
const val READ_TIME_OUT = 1000L
const val WRITE_TIME_OUT = 1000L
const val SOCKET_CONNECT_TIME_OUT = 1000

fun requestToTrsServer(niceVanlp:String, niceVanPort: Int, buffer: ByteArray):ByteArray{

    Socket().use {
        socket ->
        try{
            socket.connect(InetSocketAddress(niceVanlp, niceVanPort), SOCKET_CONNECT_TIME_OUT)
            val bufferedSink = socket.sink().buffer()
            with(bufferedSink){
                timeout().timeout(WRITE_TIME_OUT, TimeUnit.MILLISECONDS)
                write(buffer)
                flush()
                socket.shutdownOutput()
            }
            //서버로 byte array 보내기
            val bufferedSource = socket.source().buffer()
            val responeBytes =
                with(bufferedSource){
                    timeout().timeout(READ_TIME_OUT, TimeUnit.MILLISECONDS)
                    readByteArray()
                }
            bufferedSink.close()
            bufferedSource.close()
            return responeBytes

        }catch (e:IOException){
            println("소켓 서버와 TCP 통신 중 IOException 발생")
            return ByteArray(1)
        }
    }
}