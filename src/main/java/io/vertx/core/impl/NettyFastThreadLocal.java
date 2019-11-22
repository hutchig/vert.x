package io.vertx.core.impl;

import io.netty.util.internal.InternalThreadLocalMap;

public interface NettyFastThreadLocal {

  /**
   * Returns the internal data structure that keeps the thread-local variables
   * bound to this thread. Note that this method is for internal use only, and
   * thus is subject to change at any time.
   */
  InternalThreadLocalMap threadLocalMap();

  /**
   * Sets the internal data structure that keeps the thread-local variables bound
   * to this thread. Note that this method is for internal use only, and thus is
   * subject to change at any time.
   */
  void setThreadLocalMap(InternalThreadLocalMap threadLocalMap);

}
