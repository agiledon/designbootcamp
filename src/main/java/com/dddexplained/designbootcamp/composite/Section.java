package com.dddexplained.designbootcamp.composite;

public class Section extends QuestionElement {
    private String name;

    public Section(String name) {
        this.name = name;
    }

    @Override
    public String generate() {
        StringBuffer sb = new StringBuffer();
        appendBeginInfo(sb);
        appendChildren(sb);
        appendCurrentElement(sb);
        appendEndInfo(sb);
        return sb.toString();
    }

    private void appendChildren(StringBuffer sb) {
        for (QuestionElement element : elements) {
            sb.append(element.generate());
        }
    }

    private void appendCurrentElement(StringBuffer sb) {
        sb.append("Section is " + name);
    }

    private void appendEndInfo(StringBuffer sb) {
        sb.append("Section End.");
    }

    private StringBuffer appendBeginInfo(StringBuffer sb) {
        return sb.append("Section Begin:");
    }
}
