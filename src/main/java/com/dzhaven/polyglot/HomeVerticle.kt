package com.dzhaven.polyglot

import io.vertx.core.AbstractVerticle
import io.vertx.core.eventbus.Message

class HomeVerticle : AbstractVerticle() {
  override fun start() {
    vertx.eventBus().consumer("home.addr") {
      msg: Message<Any?> -> msg.reply("Welcome home Kotlin")
    }
  }
}
