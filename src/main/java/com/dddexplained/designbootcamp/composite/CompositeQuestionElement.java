package com.dddexplained.designbootcamp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeQuestionElement implements QuestionElement {
    protected List<QuestionElement> elements = new ArrayList<>();

    @Override
    public String generate() {
        StringBuffer sb = new StringBuffer();

        appendBeginInfo(sb);
        appendChildren(sb);
        appendCurrent(sb);
        appendEndInfo(sb);

        return sb.toString();
    }

    public void add(QuestionElement element) {
        elements.add(element);
    }

    public void remove(QuestionElement element) {
        elements.remove(element);
    }

    private void appendChildren(StringBuffer sb) {
        for (QuestionElement element : elements) {
            sb.append(element.generate());
        }
    }

    protected abstract void appendBeginInfo(StringBuffer sb);

    protected abstract void appendCurrent(StringBuffer sb);

    protected abstract void appendEndInfo(StringBuffer sb);
}
