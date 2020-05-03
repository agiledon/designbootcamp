package com.dddexplained.designbootcamp.composite;

public class Section extends CompositeQuestionElement {
    private String name;

    public Section(String name) {
        this.name = name;
    }

    @Override
    protected void appendBeginInfo(StringBuffer sb) {
        sb.append("Section Begin:");
    }

    @Override
    protected void appendCurrent(StringBuffer sb) {
        sb.append("Section is " + name);
    }

    @Override
    protected void appendEndInfo(StringBuffer sb) {
        sb.append("Section End.");
    }
}
