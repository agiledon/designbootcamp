package com.dddexplained.designbootcamp.composite;

public class SubSection extends CompositeQuestionElement {
    private String name;

    public SubSection(String name) {
        this.name = name;
    }

    @Override
    protected void appendBeginInfo(StringBuffer sb) {
        sb.append("Sub Section Begin:");
    }

    @Override
    protected void appendCurrent(StringBuffer sb) {
        sb.append("Sub Section is " + name);
    }

    @Override
    protected void appendEndInfo(StringBuffer sb) {
        sb.append("SubSection End.");
    }
}
