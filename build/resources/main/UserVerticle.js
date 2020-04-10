vertx.eventBus().consumer("user.addr", function(msg) {
  msg.reply("Welcome js user " + msg.body());
});
