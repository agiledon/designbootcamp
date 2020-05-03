package com.dddexplained.designbootcamp.composite;

public class QuestionGroup extends CompositeQuestionElement {
    private String name;

    public QuestionGroup(String name) {
        this.name = name;
    }

    @Override
    protected void appendBeginInfo(StringBuffer sb) {
        sb.append("Question Group Begin:");
    }

    @Override
    protected void appendCurrent(StringBuffer sb) {
        sb.append("Question Group is " + name);
    }

    @Override
    protected void appendEndInfo(StringBuffer sb) {
        sb.append("Question Group End.");
    }
}
