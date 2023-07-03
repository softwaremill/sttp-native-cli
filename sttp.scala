//> using toolkit latest

import sttp.client4.*
import sttp.client4.curl.*
import sttp.client4.Response

object sttp4Native extends App:
    val backend = CurlBackend()
    val response: Response[String] = quickRequest
      .get(uri"http://icanhazip.com")
      .send(backend)

    println(response.body)
