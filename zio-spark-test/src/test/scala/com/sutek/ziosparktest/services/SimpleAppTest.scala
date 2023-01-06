package com.sutek.ziosparktest.services

import org.scalatest.flatspec.AnyFlatSpec
import zio.spark.parameter.localAllNodes
import zio.spark.sql.SparkSession

class SimpleAppTest extends AnyFlatSpec {

  "A simple app " should "be able to red data" in {
    val session = SparkSession.builder.master(localAllNodes).appName("app").asLayer

    //    job.provide(session)

    val job =
      for {
        values <- zio.ZIO.fail("sdfsdfdsfs")
        /*maybePeople <- pipeline.run
        _ <- maybePeople match {
            case None    => Console.printLine("There is nobody :(.")
            case Some(p) => Console.printLine(s"The first person's name is ${p.name}.")
          }*/
      } yield {
        true
      }

    }
}
