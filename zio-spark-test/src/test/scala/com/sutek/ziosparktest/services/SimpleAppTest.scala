package com.sutek.ziosparktest.services

import com.sutek.ziosparktest.services.SimpleApp.job
import org.scalatest.flatspec.AnyFlatSpec
import zio.spark.parameter.localAllNodes
import zio.spark.sql.SparkSession

class SimpleAppTest extends AnyFlatSpec {

  "A simple app " should "be able to red data" in {
    val session = SparkSession.builder.master(localAllNodes).appName("app").asLayer
    job.provide(session)
  }
}
