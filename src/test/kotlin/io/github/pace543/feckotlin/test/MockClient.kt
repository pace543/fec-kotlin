package io.github.pace543.feckotlin.test

import io.github.pace543.feckotlin.OpenFECClient
import okhttp3.HttpUrl
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import okio.Buffer
import java.io.File
import java.nio.charset.Charset

val mockClient: OpenFECClient = OpenFECClient("", OpenFECMockServer.url.toString())

object OpenFECMockServer {
    private val mockServer: MockWebServer = MockWebServer()
    val url: HttpUrl = mockServer.url("/v1")

    init {
        mockServer.setDispatcher(object : Dispatcher() {
            override fun dispatch(request: RecordedRequest?): MockResponse {
                val path = request?.path?.let {
                    val f = it.replace("/", "-")
                    f.replace("?api_key=", "")
                }
                val file = File(OpenFECMockServer::class.java.getResource("/$path.json").toURI())
                return if (file.exists()) {
                    MockResponse().setBody(Buffer().writeString(file.readText(), Charset.defaultCharset()))
                } else {
                    MockResponse().setResponseCode(404)
                }
            }
        })
    }
}
