//> using toolkit latest

import sttp.client4.quick.*
import sttp.client4.Response

@main def sttpExample: Unit =
  val response: Response[String] = quickRequest
    .get(uri"http://icanhazip.com")
    .send()

  println(response.body)
