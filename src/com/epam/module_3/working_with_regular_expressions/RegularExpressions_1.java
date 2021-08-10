/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
 * выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */

package com.epam.module_3.working_with_regular_expressions;

import java.util.Scanner;

public class RegularExpressions_1 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "The house stood on a slight rise just on the edge of the village. " +
                "It stood on its own and looked over a broad spread of West Country farmland. " +
                "Not a remarkable house by any means - it was about thirty years old, " +
                "squattish, squarish, made of brick, and had four windows set in the front of " +
                "a size and proportion which more or less exactly " +
                "failed to please the eye.\n\n" +
                "The only person for whom the house was in any way special was " +
                "Arthur Dent, and that was only because it happened to be the one he " +
                "lived in. He had lived in it for about three years, ever since he had " +
                "moved out of London because it made him nervous and irritable. He " +
                "was about thirty as well, dark haired and never quite at ease with " +
                "himself. The thing that used to worry him most was the fact that " +
                "people always used to ask him what he was looking so worried about. " +
                "He worked in local radio which he always used to tell his friends was a " +
                "lot more interesting than they probably thought. It was, too - most of " +
                "his friends worked in advertising.\n\n" +
                "It hadn't properly registered with Arthur that the council wanted to " +
                "knock down his house and build an bypass instead.\n\n" +
                "At eight o'clock on Thursday morning Arthur didn't feel very good. " +
                "He woke up blearily, got up, wandered blearily round his room, " +
                "opened a window, saw a bulldozer, found his slippers, and stomped " +
                "off to the bathroom to wash.\n\n" +
                "Toothpaste on the brush - so. Scrub.\n\n" +
                "Shaving mirror - pointing at the ceiling. He adjusted it. For a " +
                "moment it reflected a second bulldozer through the bathroom " +
                "window. Properly adjusted, it reflected Arthur Dent's bristles. He " +
                "shaved them off, washed, dried, and stomped off to the kitchen to " +
                "find something pleasant to put in his mouth.\n\n" +
                "Kettle, plug, fridge, milk, coffee. Yawn.\n\n" +
                "The word bulldozer wandered through his mind for a moment in " +
                "search of something to connect with.\n\n" +
                "The bulldozer outside the kitchen window was quite a big one.\n\n" +
                "He stared at it.\n\n" +
                "\"Yellow,\" he thought and stomped off back to his bedroom to get " +
                "dressed.\n\n" +
                "Passing the bathroom he stopped to drink a large glass of water, " +
                "and another. He began to suspect that he was hung over. Why was he " +
                "hung over? Had he been drinking the night before? He supposed that " +
                "he must have been. He caught a glint in the shaving mirror. \"Yellow,\" " +
                "he thought and stomped on to the bedroom.\n\n" +
                "He stood and thought. The pub, he thought. Oh dear, the pub. He " +
                "vaguely remembered being angry, angry about something that " +
                "seemed important. He'd been telling people about it, telling people " +
                "about it at great length, he rather suspected: his clearest visual " +
                "recollection was of glazed looks on other people's faces. Something " +
                "about a new bypass he had just found out about. It had been in the " +
                "pipeline for months only no one seemed to have known about it. " +
                "Ridiculous. He took a swig of water. It would sort itself out, he'd " +
                "decided, no one wanted a bypass, the council didn't have a leg to " +
                "stand on. It would sort itself out.\n\n" +
                "God what a terrible hangover it had earned him though. He looked " +
                "at himself in the wardrobe mirror. He stuck out his tongue. \"Yellow,\" " +
                "he thought. The word yellow wandered through his mind in search of " +
                "something to connect with.\n\n" +
                "Fifteen seconds later he was out of the house and lying in front of a " +
                "big yellow bulldozer that was advancing up his garden path.\n";
        System.out.println(str);
        System.out.println("If you want to sort paragraphs by number of sentences, enter 1.\n" +
                "If you want to sor words in sentences by length, enter 2.\n" +
                "If you want to sor words in sentences by number of occurences of a given symbol, enter 3.\n" +
                "Enter 1, 2, or 3:");

        int answer = scan.nextInt();

        if (answer == 1) {
            str = sortParagraphsByNumberOfSentences(str);
        } else if (answer == 2) {
            str = sortWordsInSentencesByLength(str);
        } else if (answer == 3) {
            str = sortWordsInSentencesByNumberOfOccurencesOfASymbol(str);
        }

        System.out.println(str);
    }

    private static String sortParagraphsByNumberOfSentences(String str) {
        String[] paragraphs = str.split("\n\n");

        for (int i = 1; i < paragraphs.length; i++) {
            String[] sentences1 = paragraphs[i - 1].split("[.]");
            String[] sentences2 = paragraphs[i].split("[.?!]");

            if (sentences1.length > sentences2.length) {
                String buffer = paragraphs[i - 1];
                paragraphs[i - 1] = paragraphs[i];
                paragraphs[i] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }

        str = String.join("\n\n", paragraphs);
        return str;
    }

    private static String sortWordsInSentencesByLength(String str) {
        String[] sentences = str.replaceAll("[\n\",-]", "").replaceAll(" {2}", " ").split("[.?!]");
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for (int j = 1; j < words.length; j++) {
                if (words[j].length() < words[j - 1].length()) {
                    String buffer = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = buffer;
                    if (j > 1) {
                        j -= 2;
                    }
                }
            }
            sentences[i] = String.join(" ", words).stripLeading() + ". ";
        }
        str = String.join("\n", sentences);
        return str;
    }

    private static String sortWordsInSentencesByNumberOfOccurencesOfASymbol(String str) {
        System.out.println("Enter symbol for sorting words in sentences:");

        String symbol = scan.next();

        String[] sentences = str.toLowerCase().replaceAll("\n\t", " ").replaceAll("[\",-]", "").replaceAll(" {2}", " ").split("[.?!]");

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].strip().split(" ");

            String buffer;
            for (int j = 1; j < words.length; j++) {
                if (words[j].split(symbol).length > words[j - 1].split(symbol).length || (words[j].split(symbol).length == words[j - 1].split(symbol).length && words[j].codePointAt(0) < words[j - 1].codePointAt(0))) {
                    buffer = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = buffer;
                    if (j > 1) {
                        j -= 2;
                    }
                }
            }

            sentences[i] = String.join(" ", words);
        }

        str = String.join(".\n", sentences);
        return str;
    }
}
