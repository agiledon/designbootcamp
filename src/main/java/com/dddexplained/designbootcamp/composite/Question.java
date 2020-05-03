package com.dddexplained.designbootcamp.composite;

public class Question extends CompositeQuestionElement {
    private String name;

    public Question(String name) {
        this.name = name;
    }

    @Override
    protected void appendBeginInfo(StringBuffer sb) {
        sb.append("Question Begin:");
    }

    @Override
    protected void appendCurrent(StringBuffer sb) {
        sb.append("Question is " + name);
    }

    @Override
    protected void appendEndInfo(StringBuffer sb) {
        sb.append("Question End.");
    }
}
