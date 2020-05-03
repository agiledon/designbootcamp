package com.dddexplained.designbootcamp.infoexpert.after.web;

import com.dddexplained.designbootcamp.infoexpert.after.engine.*;

import javax.servlet.http.HttpServletRequest;

public class ParameterController {
    public void fillParameters(HttpServletRequest request, ParameterGraph parameterGraph) {
        for (Parameter para : parameterGraph.getParameters()) {
            para.fill(request);
        }
    }

}
