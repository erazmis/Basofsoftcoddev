package com.epam.module_4.aggregation_and_composition.task_1;

public class Sentence {

    private String sentence;

    public Sentence(Word... words) {
        StringBuilder line = new StringBuilder(words[0].toString());

        for (int i = 0; i < words.length; i++) {
            line.append(" " + words[i].toString());
        }

        sentence = line.append(". ").toString();
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
