package ktordockertest

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.html.*
import kotlinx.html.*
import kotlinx.css.*
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import kotlin.test.*
import io.ktor.server.testing.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
//                val html = "<html>\n" +
//                        "\t<body>\n" +
//                        "\t\t<ul>\n" +
//                        "\t\t\t<li>1</li>\n" +
//                        "\t\t\t<li>2</li>\n" +
//                        "\t\t\t<li>3</li>\n" +
//                        "\t\t</ul>\n" +
//                        "\t</body>\n" +
//                        "</html>"
//                assertEquals(html, response.content)
            }
        }
    }
}
