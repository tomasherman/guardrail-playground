package example

import petstore.client.pets.CreatePetsResponse

object Hello extends Greeting with App {
  
    println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
