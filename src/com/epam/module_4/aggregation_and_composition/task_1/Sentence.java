package com.epam.module_4.aggregation_and_composition.task_1;

public class Sentence {

    private Word[] words;

    public Sentence(Word... words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        String[] words = new String[this.words.length];

        if (this.words[0].toString().charAt(0) >= 'a' && this.words[0].toString().charAt(0) <= 'z') {
            this.words[0] = new Word(this.words[0].toString().replace(this.words[0].toString().charAt(0), (char) (this.words[0].toString().charAt(0) - 32)));
        }

        for (int i = 0; i < this.words.length; i++) {
            words[i] = this.words[i].toString();
        }


        return String.join(" ", words);
    }
}
