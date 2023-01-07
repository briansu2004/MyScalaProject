package com.sutek.ziosparktest.services

import java.io.IOException
import zio._

 object HelloWorld extends ZIOAppDefault {
  def sayHello: ZIO[Any, IOException, Unit] =
    Console.printLine("Hello, World!")

   override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = {
     sayHello
   }
 }
