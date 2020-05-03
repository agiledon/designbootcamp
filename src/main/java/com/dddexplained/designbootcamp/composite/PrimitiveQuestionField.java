package com.dddexplained.designbootcamp.composite;

public class PrimitiveQuestionField implements QuestionElement {
    private String name;

    public PrimitiveQuestionField(String name) {
        this.name = name;
    }

    @Override
    public String generate() {
        return "Question Field is " + name;
    }
}
