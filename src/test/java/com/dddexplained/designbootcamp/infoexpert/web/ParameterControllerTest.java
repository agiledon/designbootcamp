package com.dddexplained.designbootcamp.infoexpert.web;

import org.junit.Test;

public class ParameterControllerTest {
    @Test
    public void should_build_paras() {
        ParameterController controller = new ParameterController();
        controller.fillParameters(null, null);
    }

}