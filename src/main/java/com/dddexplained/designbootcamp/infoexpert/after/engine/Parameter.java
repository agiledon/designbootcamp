package com.dddexplained.designbootcamp.infoexpert.after.engine;

import javax.servlet.http.HttpServletRequest;

public interface Parameter {
    String getName();

    void fill(HttpServletRequest request);
}
