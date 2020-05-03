package com.dddexplained.designbootcamp.composite;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SectionTest {
    @Test
    public void should_generate_questionaire() {
        Section section = buildQuestionaire();

        assertThat(section.generate()).isEqualTo(expectedResult());
    }

    private Section buildQuestionaire() {
        PrimitiveQuestionField stringField = new PrimitiveQuestionField("String");
        PrimitiveQuestionField intField = new PrimitiveQuestionField("Integer");
        PrimitiveQuestionField booleanField = new PrimitiveQuestionField("Boolean");

        Section section = new Section("root section");

        SubSection leftSubSection = new SubSection("left sub section");
        SubSection rightSubSection = new SubSection("right sub section");
        section.add(leftSubSection);
        section.add(rightSubSection);

        QuestionGroup leftGroupA = new QuestionGroup("left group A");
        QuestionGroup leftGroupB = new QuestionGroup("left group B");
        leftSubSection.add(leftGroupA);
        leftSubSection.add(leftGroupB);

        QuestionGroup rightGroupA = new QuestionGroup("right group A");
        rightSubSection.add(rightGroupA);

        Question questionLeftA1 = new Question("Are you OK?");
        questionLeftA1.add(stringField);
        questionLeftA1.add(booleanField);

        Question questionLeftA2 = new Question("How old are you?");
        questionLeftA2.add(stringField);
        questionLeftA2.add(intField);

        leftGroupA.add(questionLeftA1);
        leftGroupA.add(questionLeftA2);

        Question questionLeftB1 = new Question("Who are you?");
        questionLeftB1.add(stringField);
        leftGroupB.add(questionLeftB1);

        Question questionRightA1 = new Question("Is Java the best language?");
        questionRightA1.add(stringField);
        questionRightA1.add(booleanField);

        Question questionRightA2 = new Question("Are you familiar with Design Patterns?");
        questionRightA2.add(stringField);
        questionRightA2.add(booleanField);

        rightGroupA.add(questionRightA1);
        rightGroupA.add(questionRightA2);
        return section;
    }

    private String expectedResult() {
        return "Section Begin:" +
                "Sub Section Begin:" +
                "Question Group Begin:" +
                "Question Begin:" +
                "Question Field is String" +
                "Question Field is Boolean" +
                "Question is Are you OK?" +
                "Question End." +
                "Question Begin:" +
                "Question Field is String" +
                "Question Field is Integer" +
                "Question is How old are you?" +
                "Question End." +
                "Question Group is left group A" +
                "Question Group End." +
                "Question Group Begin:" +
                "Question Begin:" +
                "Question Field is String" +
                "Question is Who are you?" +
                "Question End." +
                "Question Group is left group B" +
                "Question Group End." +
                "Sub Section is left sub section" +
                "SubSection End." +
                "Sub Section Begin:" +
                "Question Group Begin:" +
                "Question Begin:" +
                "Question Field is String" +
                "Question Field is Boolean" +
                "Question is Is Java the best language?" +
                "Question End." +
                "Question Begin:" +
                "Question Field is String" +
                "Question Field is Boolean" +
                "Question is Are you familiar with Design Patterns?" +
                "Question End." +
                "Question Group is right group A" +
                "Question Group End." +
                "Sub Section is right sub section" +
                "SubSection End." +
                "Section is root section" +
                "Section End.";
    }
}