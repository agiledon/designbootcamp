package com.dddexplained.designbootcamp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class QuestionElement {
    protected List<QuestionElement> elements = new ArrayList<>();

    public abstract String generate();
    public void add(QuestionElement element) {
        elements.add(element);
    }

    public void remove(QuestionElement element) {
        elements.remove(element);
    }
}
