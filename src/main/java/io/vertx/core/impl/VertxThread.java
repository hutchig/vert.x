package io.vertx.core.impl;

import java.util.concurrent.TimeUnit;

public interface VertxThread extends BlockedThreadChecker.Task, NettyFastThreadLocal {

  @Override
  long startTime();

  boolean isWorker();

  @Override
  long maxExecTime();

  @Override
  TimeUnit maxExecTimeUnit();

}
