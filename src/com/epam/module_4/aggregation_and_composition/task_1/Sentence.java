package com.epam.module_4.aggregation_and_composition.task_1;

public class Sentence {

    private Word[] sentence;

    public Sentence(Word... words) {
        sentence = words;
    }

    public Sentence(String str) {
        String[] words = str.replace(".", "").stripLeading().split(" ");
        sentence = new Word[words.length];
        for (int i = 0; i < words.length; i++) {
            sentence[i] = new Word(words[i]);
        }
    }

    public Word[] getSentence() {
        return sentence;
    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        String[] words = new String[sentence.length];

        if (sentence[0].toString().charAt(0) >= 'a' && sentence[0].toString().charAt(0) <= 'z') {
            sentence[0] = new Word(sentence[0].toString().replace(sentence[0].toString().charAt(0), (char) (sentence[0].toString().charAt(0) - 32)));
        }

        for (int i = 0; i < sentence.length; i++) {
            words[i] = sentence[i].toString();
        }


        return String.join(" ", words) + ".";
    }
}
