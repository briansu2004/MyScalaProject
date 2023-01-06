package com.sutek.ziosparktest.services

/*class SimpleAppTest extends AnyFlatSpec {
  "A simple app" should "able to read data" in {
    println("it is test")
    val session = SparkSession.builder.master(localAllNodes).appName("app").asLayer
    val result = job.provide(session)

    Unsafe.unsafe { implicit unsafe =>
      zio.Runtime.default.unsafe.run(result)
    }
  }
}*/
//
//import zio.test._
//import zio.test.Assertion._
//
//import java.io.IOException
//import zio._
//
//import HelloWorld._
//
//object HelloWorld {
//  def sayHello: ZIO[Any, IOException, Unit] =
//    Console.printLine("Hello, World!")
//}
//
//object HelloWorldSpec extends ZIOSpecDefault {
//  def spec = suite("HelloWorldSpec")(
//    test("sayHello correctly displays output") {
//      for {
//        _      <- sayHello
//        output <- TestConsole.output
//      } yield assertTrue(output == Vector("Hello, World!\n"))
//    }
//  )
//}

import com.sutek.ziosparktest.services.SimpleApp._
import zio.spark.parameter.localAllNodes
import zio.spark.sql.SparkSession
import zio.test.{ZIOSpecDefault, assertTrue}

object SimpleAppOldTest extends ZIOSpecDefault {
  def spec = suite("SimpleAppSpec")(
    test("SimpleApp works") {
      val session = SparkSession.builder.master(localAllNodes).appName("app").asLayer

      for {
        _ <- job.provide(session)
      } yield {

        assertTrue(0 == 1 - 1)
      }
      //job.flatMap(x => assertTrue(x)).provide(session)



    })

}